package modelosDatos;

import entidades.Usuarios;
import datos.*;
import entidades.Categoria;
import entidades.Consumible;
import entidades.Estreno;
import entidades.Horarios;
import entidades.MPagos;
import entidades.Miembros;
import entidades.Movies;
import entidades.SalasAsociadas;
import entidades.TDocumentos;
import entidades.TUsuarios;
import entidades.Salas;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ModeloTablas {
    private final SetMapData smd = new SetMapData();
    private final UsuariosCRUD uc = new UsuariosCRUD();
    private final MiembrosCRUD mc = new MiembrosCRUD();
    private final TUsuariosCRUD tuc = new TUsuariosCRUD();
    private final TDocumentosCRUD tdc = new TDocumentosCRUD();
    private final MovieCRUD moc = new MovieCRUD();
    private final MPagosCRUD mpc = new MPagosCRUD();
    private final ComidasCRUD cc = new ComidasCRUD();
    private final BebidasCRUD bc = new BebidasCRUD();
    private final HorariosCRUD hc = new HorariosCRUD();
    private final CategoriaCRUD ctc = new CategoriaCRUD();
    private final EstrenoCRUD ec = new EstrenoCRUD();
    private final SalasCRUD sc = new SalasCRUD();
    private final SalasAsociadasCRUD sac = new SalasAsociadasCRUD();
    

    public DefaultTableModel modeloUsuario() {
        DefaultTableModel modeloUser;
        modeloUser = new DefaultTableModel();
        List<Usuarios> lista = uc.mostrar();
        String[] registro = new String[7];

        modeloUser.addColumn("Código");
        modeloUser.addColumn("Nombre");
        modeloUser.addColumn("Tipo Doc");
        modeloUser.addColumn("Numero Doc");
        modeloUser.addColumn("Correo");
        modeloUser.addColumn("Contraseña");
        modeloUser.addColumn("Tipo Usuario");

        for (Usuarios dato : lista) {
            registro[0] = Integer.toString(dato.getCodigo());
            registro[1] = dato.getNombre();
            int tDoc = dato.getTipoDoc();
            for (String key : smd.keysTDoc) {
                int valor = smd.lisTDoc.get(key);
                if (tDoc == valor) {
                    registro[2] = key;
                    break;
                }
            }
            registro[3] = Integer.toString(dato.getNumeroDoc());
            registro[4] = dato.getCorreo();
            registro[5] = dato.getPass();
            int tUser = dato.getTipoUser();
            for (String key : smd.keysTUser) {
                int valor = smd.lisTUser.get(key);
                if (tUser == valor) {
                    registro[6] = key;
                    break;
                }
            }
            modeloUser.addRow(registro);
        }
        return modeloUser;
    }

    public DefaultTableModel modeloMiembro() {
        DefaultTableModel modeloMember;
        List<Miembros> lista = mc.mostrar();
        String[] registro = new String[4];
        modeloMember = new DefaultTableModel();

        modeloMember.addColumn("Código");
        modeloMember.addColumn("Nombre");
        modeloMember.addColumn("Tipo Doc");
        modeloMember.addColumn("Numero Doc");

        for (Miembros dato : lista) {
            registro[0] = Integer.toString(dato.getCodigo());
            registro[1] = dato.getNombre();
            int tDoc = dato.getTipoDoc();
            for (String key : smd.keysTDoc) {
                int valor = smd.lisTDoc.get(key);
                if (tDoc == valor) {
                    registro[2] = key;
                    break;
                }
            }
            registro[3] = Integer.toString(dato.getNumeroDoc());
            modeloMember.addRow(registro);
        }
        return modeloMember;
    }
    
    public DefaultTableModel modeloTUser(){
        DefaultTableModel modeloTUser;
        List<TUsuarios> lista = tuc.mostrar();
        String[] registro = new String[2];
        modeloTUser = new DefaultTableModel();

        modeloTUser.addColumn("Código");
        modeloTUser.addColumn("Descripcion");

        for (TUsuarios dato : lista) {
            registro[0] = Integer.toString(dato.getCodigo());
            registro[1] = dato.getName();
            modeloTUser.addRow(registro);
        }
        return modeloTUser;
    }
    
    public DefaultTableModel modeloTDoc(){
        DefaultTableModel modeloTDoc;
        List<TDocumentos> lista = tdc.mostrar();
        String[] registro = new String[2];
        modeloTDoc = new DefaultTableModel();

        modeloTDoc.addColumn("Código");
        modeloTDoc.addColumn("Descripcion");

        for (TDocumentos dato : lista) {
            registro[0] = Integer.toString(dato.getCodigo());
            registro[1] = dato.getName();
            modeloTDoc.addRow(registro);
        }
        return modeloTDoc;
    }
    
    public DefaultTableModel modeloMPago(){
        DefaultTableModel modeloMPay;
        modeloMPay = new DefaultTableModel();
        List<MPagos> lista = mpc.mostrar();
        String[] registro = new String[2];

        modeloMPay.addColumn("Código");
        modeloMPay.addColumn("Nombre");

        for (MPagos dato : lista) {
            registro[0] = Integer.toString(dato.getCodigo());
            registro[1] = dato.getNombre();
            modeloMPay.addRow(registro);
        }
        return modeloMPay;
    }
    
    public DefaultTableModel modeloComida(){
        DefaultTableModel modeloComida;
        modeloComida = new DefaultTableModel();
        List<Consumible> lista = cc.mostrar();
        String[] registro = new String[3];

        modeloComida.addColumn("Código");
        modeloComida.addColumn("Nombre Comida");
        modeloComida.addColumn("Precio");

        for (Consumible dato : lista) {
            registro[0] = Integer.toString(dato.getCodigo());
            registro[1] = dato.getNombre();
            registro[2] = Double.toString(dato.getPrecio());
            modeloComida.addRow(registro);
        }
        return modeloComida;
    }
    
    public DefaultTableModel modeloBebida(){
        DefaultTableModel modeloBebida;
        modeloBebida = new DefaultTableModel();
        List<Consumible> lista = bc.mostrar();
        String[] registro = new String[3];

        modeloBebida.addColumn("Código");
        modeloBebida.addColumn("Nombre Bebida");
        modeloBebida.addColumn("Precio");

        for (Consumible dato : lista) {
            registro[0] = Integer.toString(dato.getCodigo());
            registro[1] = dato.getNombre();
            registro[2] = Double.toString(dato.getPrecio());
            modeloBebida.addRow(registro);
        }
        return modeloBebida;
    }
    
    public DefaultTableModel modeloPelicula(){
        DefaultTableModel modeloMovie;
        modeloMovie = new DefaultTableModel();
        List<Movies> lista = moc.mostrar();
        String[] registro = new String[6];

        modeloMovie.addColumn("Código");
        modeloMovie.addColumn("Nombre");
        modeloMovie.addColumn("Duración");
        modeloMovie.addColumn("Categoria");
        modeloMovie.addColumn("Descripción");
        modeloMovie.addColumn("Horario");

        for (Movies dato : lista) {
            registro[0] = Integer.toString(dato.getCodigo());
            registro[1] = dato.getNombre();
            registro[2] = Double.toString(dato.getDuracion());
            int idCateg = dato.getIdCategoria();
            for (String key : smd.keysCateg) {
                int valor = smd.lisCateg.get(key);
                if (idCateg == valor) {
                    registro[3] = key;
                    break;
                }
            }
            registro[4] = dato.getDescripcion();
            int idHora = dato.getIdHora();
            for (String key : smd.keysHour) {
                int valor = smd.lisHour.get(key);
                if (idHora == valor) {
                    registro[5] = key;
                    break;
                }
            }
            modeloMovie.addRow(registro);
        }
        return modeloMovie;
    }
    
    public DefaultTableModel modeloSalaPeli(){
        DefaultTableModel modeloDRoom;
        modeloDRoom = new DefaultTableModel();
        List<SalasAsociadas> lista = sac.mostrar();
        String[] registro = new String[2];

        modeloDRoom.addColumn("Sala");
        modeloDRoom.addColumn("Peliculas");

        for (SalasAsociadas dato : lista) {
            int codePeli = dato.getCodigoPeli();
            for (String key : smd.keysMovie) {
                int valor = smd.lisMovie.get(key);
                if (codePeli == valor) {
                    registro[0] = key;
                    break;
                }
            }
            int codeRoom = dato.getCodigoSala();
            for (String key : smd.keysRoom) {
                int valor = smd.lisRoom.get(key);
                if (codeRoom == valor) {
                    registro[1] = key;
                    break;
                }
            }
            modeloDRoom.addRow(registro);
        }
        return modeloDRoom;
    }
    
    public DefaultTableModel modeloSala(){
        DefaultTableModel modeloDRoom;
        modeloDRoom = new DefaultTableModel();
        List<Salas> lista = sc.mostrar();
        String[] registro = new String[3];

        modeloDRoom.addColumn("Codigo");
        modeloDRoom.addColumn("Nombre Salas");
        modeloDRoom.addColumn("Capacidad");

        for (Salas dato : lista) {
            int codeRoom = dato.getCodigo();
            String nameRoom = dato.getNombre();
            int capacity = dato.getCapacidad();
            registro[0] = Integer.toString(codeRoom);
            registro[1] = nameRoom;
            registro[2] = Integer.toString(capacity);
            modeloDRoom.addRow(registro);
        }
        return modeloDRoom;
    }
    
    public DefaultTableModel modeloHorario(){
        DefaultTableModel modeloHorario;
        modeloHorario = new DefaultTableModel();
        List<Horarios> lista = hc.mostrar();
        String[] registro = new String[2];

        modeloHorario.addColumn("Codigo");
        modeloHorario.addColumn("Hora");

        for (Horarios dato : lista) {
            int code = dato.getCodigo();
            String hora = dato.getHora();
            registro[0] = Integer.toString(code);
            registro[1] = hora;
            modeloHorario.addRow(registro);
        }
        return modeloHorario;
    }
    
    public DefaultTableModel modeloCategoria(){
        DefaultTableModel modeloCategoria;
        modeloCategoria = new DefaultTableModel();
        List<Categoria> lista = ctc.mostrar();
        String[] registro = new String[3];

        modeloCategoria.addColumn("Codigo");
        modeloCategoria.addColumn("Categoria");
        modeloCategoria.addColumn("Descripcion");

        for (Categoria dato : lista) {
            int codeCatg = dato.getCodigo();
            String nameCatg = dato.getNombre();
            String descrip = dato.getDescripcion();
            registro[0] = Integer.toString(codeCatg);
            registro[1] = nameCatg;
            registro[2] = descrip;
            modeloCategoria.addRow(registro);
        }
        return modeloCategoria;
    }
    
    public DefaultTableModel modeloEstreno(){
        DefaultTableModel modeloEstreno;
        modeloEstreno = new DefaultTableModel();
        List<Estreno> lista = ec.mostrar();
        String[] registro = new String[2];

        modeloEstreno.addColumn("Codigo");
        modeloEstreno.addColumn("Fecha");

        for (Estreno dato : lista) {
            int codePeli = dato.getCodigoPeli();
            for (String key : smd.keysMovie) {
                int valor = smd.lisMovie.get(key);
                if (codePeli == valor) {
                    registro[0] = key;
                    break;
                }
            }
            String fecha = dato.getFecha();
            registro[1] = fecha;
            modeloEstreno.addRow(registro);
        }
        return modeloEstreno;
    }
}
