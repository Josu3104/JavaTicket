package GUI;

import Eventos.Enums.tipoDeporte;
import Eventos.Enums.tipoEvento;
import static Eventos.Enums.tipoEvento.DEPORTIVO;
import static Eventos.Enums.tipoEvento.MUSICAL;
import static Eventos.Enums.tipoEvento.RELIGIOSO;
import Eventos.Enums.tipoMusica;
import Eventos.Evento;
import static Eventos.Evento.eventos;
import Eventos.EventoDeportivo;
import Eventos.EventoMusical;
import Eventos.EventoReligioso;
import Usuarios.UsuarioDefault;
import com.toedter.calendar.JTextFieldDateEditor;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Josue Gavidia
 */
public class Sistema extends javax.swing.JFrame implements Cardeable {

    //fechita improv
    UsuarioDefault toolKit;
    public Calendar FECHA;
    public static SimpleDateFormat fechaNeitor;
    public static Date dateSelected;
    //CORE ---> ARREGLOS QUE CONTIENEN EVENTOS Y USUARIOS
    public static UsuarioDefault usuarios[];
    private Evento tk;

    public static String loggeado;
    private tipoEvento selection;
    private tipoDeporte sport;
    private tipoMusica music;
    private tipoDeporte spa;
    private ImageIcon musical;
    private ImageIcon deportivo;
    private ImageIcon religioso;
    private boolean editable;
    private ArrayList p1 = new ArrayList();
    private ArrayList p2 = new ArrayList();

    public Sistema() throws NullPointerException {

        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        fechaNeitor = new SimpleDateFormat("dd/MM/yyyy");
        FECHA = Calendar.getInstance();
        this.RealTime.setText(fechaNeitor.format(FECHA.getTime()));
        tk = new Evento(0, -1, "", "", 0.0);
        toolKit = new UsuarioDefault("Erick Amaya", "admin", "supersecreto", "administrador", 34);
        usuarios = new UsuarioDefault[10];
        usuarios[0] = toolKit;
        initWindows();
        this.AgeSelector.setSelectedItem(null);
        this.autoridad.setSelectedItem(null);

        this.usernameField.setText("admin");
        this.passwordField.setText("supersecreto");

        musical = new ImageIcon("eventsIcons/music.png");
        deportivo = new ImageIcon("eventsIcons/sport.png");
        religioso = new ImageIcon("eventsIcons/cross.png");
        editable = false;

    }

//MISC METHODS
//Could be implemented with an interface
    public final void initWindows() {
        MainLogin.setVisible(true);
        MainMenu.setVisible(false);
        CrearUser.setVisible(false);
        EditarUser.setVisible(false);
        EliminarUser.setVisible(false);
        CreateUserTemp.setVisible(false);
        CREATOR.setVisible(false);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) DEIT.getDateEditor();
        editor.setEditable(false);

        D.setVisible(false);
        R.setVisible(false);
        M.setVisible(false);
        B00.setVisible(false);
        B01.setVisible(false);
        B02.setVisible(false);
        B03.setVisible(false);
        B10.setVisible(false);
        B11.setVisible(false);
        B12.setVisible(false);
        B13.setVisible(false);
        DEIT.setDate(null);
        this.FLASH_CARDS.setVisible(false);
        this.DISPLAY_AND_EDIT.setVisible(false);
        this.SAVE_EDIT.setVisible(false);
        this.CANCEL_EDIT.setVisible(false);

    }

    @Override
    public void setCards(ImageIcon music, ImageIcon sport, ImageIcon religious) {
        JButton[] flashCards = {B00, B01, B02, B03, B10, B11, B12, B13};
        Evento temp;
        int SIZE;

        if (eventos.size() >= 7) {
            SIZE = 7;
        } else {
            SIZE = eventos.size();
        }

        if (!eventos.isEmpty()) {
            for (int i = 0; i < SIZE; i++) {
                temp = eventos.get(i);
                if (temp != null) {
                    JButton tempB = flashCards[i];
                    switch (temp.eventoTipo) {
                        case DEPORTIVO:
                            tempB.setIcon(sport);

                            break;
                        case MUSICAL:
                            tempB.setIcon(music);

                            break;
                        case RELIGIOSO:
                            tempB.setIcon(religious);

                            break;

                    }
                    tempB.setVisible(true);

                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "AUN NO SE HAN CREADO EVENTOS");
        }
    }

    public void TUNER(JButton crearEv, JButton elimEv, JButton verEv, JButton crearUs, JButton editUs, JButton elimUs, JButton tune) {
        JButton[] eventos = {crearEv, elimEv, verEv};
        JButton[] usuario = {crearUs, editUs, elimUs};

        if (tuner.getText().equals("Administracion de Eventos")) {
            for (int i = 0; i < eventos.length; i++) {
                for (int j = 0; j < usuario.length; j++) {
                    eventos[i].setVisible(false);
                    usuario[j].setVisible(true);
                    tune.setText("Administracion de Usuarios");

                }

            }
        } else if (tuner.getText().equals("Administracion de Usuarios")) {
            for (int k = 0; k < eventos.length; k++) {
                for (int l = 0; l < usuario.length; l++) {
                    eventos[k].setVisible(true);
                    usuario[l].setVisible(false);
                    tune.setText("Administracion de Eventos");
                }

            }
        }

    }

    public void LogOut(JPanel login, JPanel mainMenu) {
        login.setVisible(true);
        mainMenu.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CreateUserTemp = new javax.swing.JPanel();
        fname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pw = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        AgeSelector = new javax.swing.JComboBox<>();
        create = new javax.swing.JToggleButton();
        autoridad = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        MainLogin = new javax.swing.JPanel();
        LoginBtn = new javax.swing.JButton();
        passwordField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        MainMenu = new javax.swing.JPanel();
        RealTime = new javax.swing.JLabel();
        BAR = new javax.swing.JPanel();
        BACK2MENU = new javax.swing.JButton();
        buscarProvisional = new javax.swing.JButton();
        CrearUser = new javax.swing.JButton();
        EditarUser = new javax.swing.JButton();
        CrearEvento = new javax.swing.JButton();
        BuscarEvento = new javax.swing.JButton();
        tuner = new javax.swing.JButton();
        R = new javax.swing.JButton();
        D = new javax.swing.JButton();
        M = new javax.swing.JButton();
        EliminarEvento = new javax.swing.JButton();
        EliminarUser = new javax.swing.JButton();
        CREATOR = new javax.swing.JPanel();
        BOTON_CREAR_EVENTOS = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        evName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        evCode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rent = new javax.swing.JTextField();
        t1 = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        t2 = new javax.swing.JLabel();
        T2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cantPeople = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        DEIT = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        SPORT_COMBO = new javax.swing.JComboBox<>();
        MUSIC_COMBO = new javax.swing.JComboBox<>();
        sType = new javax.swing.JLabel();
        EVENT_DISPLAY = new javax.swing.JLabel();
        DISPLAY_AND_EDIT = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        title_disp = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        codigo_disp = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        renta_disp = new javax.swing.JTextField();
        t3 = new javax.swing.JLabel();
        T1_disp = new javax.swing.JTextField();
        t4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        desc_disp = new javax.swing.JTextArea();
        DEIT_disp = new com.toedter.calendar.JDateChooser();
        INTS2 = new javax.swing.JLabel();
        SPORTS_COMBO_disp = new javax.swing.JComboBox<>();
        Convertidos_disp = new javax.swing.JTextField();
        MUSIC_COMBO_disp = new javax.swing.JComboBox<>();
        sType1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        INTS1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        integrantes2_disp = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        integrantes1_disp = new javax.swing.JList<>();
        EDITAR = new javax.swing.JToggleButton();
        SAVE_EDIT = new javax.swing.JToggleButton();
        CANCEL_EDIT = new javax.swing.JToggleButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        musics_disp = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        instruments_disp = new javax.swing.JList<>();
        rent2 = new javax.swing.JTextField();
        T2_disp = new javax.swing.JTextField();
        Integrantes2Register = new javax.swing.JTextField();
        musicosRegister = new javax.swing.JTextField();
        instrumentosRegister = new javax.swing.JTextField();
        Type_disp = new javax.swing.JLabel();
        Integrantes1Register = new javax.swing.JTextField();
        cantPersonas_disp = new javax.swing.JTextField();
        fecha_disp = new javax.swing.JLabel();
        sportType_disp = new javax.swing.JLabel();
        musicType_disp = new javax.swing.JLabel();
        FLASH_CARDS = new javax.swing.JPanel();
        B01 = new javax.swing.JButton();
        busqueda = new javax.swing.JTextField();
        search_FC = new javax.swing.JButton();
        B00 = new javax.swing.JButton();
        B02 = new javax.swing.JButton();
        B03 = new javax.swing.JButton();
        B10 = new javax.swing.JButton();
        B11 = new javax.swing.JButton();
        B12 = new javax.swing.JButton();
        B13 = new javax.swing.JButton();

        CreateUserTemp.setBackground(new java.awt.Color(0, 0, 51));
        CreateUserTemp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        CreateUserTemp.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 340, 40));

        jLabel1.setText("Nombre Completo");
        CreateUserTemp.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jLabel2.setText("Nombre de Usuario");
        CreateUserTemp.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));
        CreateUserTemp.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 340, 40));

        jLabel3.setText("Contraseña");
        CreateUserTemp.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, -1, -1));
        CreateUserTemp.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 220, 340, 40));

        jLabel4.setText("Autoridad");
        CreateUserTemp.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 350, -1, -1));

        AgeSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", " " }));
        AgeSelector.setSelectedItem(0);
        CreateUserTemp.add(AgeSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, -1, -1));

        create.setText("Crear Usuario");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        CreateUserTemp.add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 540, 220, 80));

        autoridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Contenidos", "Limitado" }));
        autoridad.setSelectedItem(null);
        autoridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoridadActionPerformed(evt);
            }
        });
        CreateUserTemp.add(autoridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 340, 130, -1));

        jLabel5.setText("Edad");
        CreateUserTemp.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));

        MainLogin.setBackground(new java.awt.Color(0, 51, 102));
        MainLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginBtn.setText("Iniciar Sesion");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        MainLogin.add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 630, 330, 90));
        MainLogin.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 370, 70));
        MainLogin.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, 370, 70));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Assets/LOGIN_ASSET.png"))); // NOI18N
        MainLogin.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2450, 1260));

        MainMenu.setBackground(new java.awt.Color(51, 0, 0));
        MainMenu.setPreferredSize(new java.awt.Dimension(1920, 1080));
        MainMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RealTime.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        RealTime.setText("DD/MM/YY");
        MainMenu.add(RealTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 30, 200, -1));

        BAR.setLayout(new java.awt.GridBagLayout());

        BACK2MENU.setText("HOME");
        BACK2MENU.setPreferredSize(new java.awt.Dimension(120, 120));
        BACK2MENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACK2MENUActionPerformed(evt);
            }
        });
        BAR.add(BACK2MENU, new java.awt.GridBagConstraints());

        buscarProvisional.setText("buscarProvisional");
        buscarProvisional.setPreferredSize(new java.awt.Dimension(120, 120));
        buscarProvisional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProvisionalActionPerformed(evt);
            }
        });
        BAR.add(buscarProvisional, new java.awt.GridBagConstraints());

        MainMenu.add(BAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 938, 1920, 120));

        CrearUser.setText("Crear Usuario");
        CrearUser.setPreferredSize(new java.awt.Dimension(407, 460));
        CrearUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearUserActionPerformed(evt);
            }
        });
        MainMenu.add(CrearUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, -1, -1));

        EditarUser.setText("Editar Usuario");
        EditarUser.setPreferredSize(new java.awt.Dimension(407, 460));
        EditarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarUserActionPerformed(evt);
            }
        });
        MainMenu.add(EditarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, -1, -1));

        CrearEvento.setText("Crear Evento");
        CrearEvento.setPreferredSize(new java.awt.Dimension(407, 460));
        CrearEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearEventoActionPerformed(evt);
            }
        });
        MainMenu.add(CrearEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        BuscarEvento.setText("Buscar Evento");
        BuscarEvento.setPreferredSize(new java.awt.Dimension(407, 460));
        BuscarEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BuscarEventoMousePressed(evt);
            }
        });
        BuscarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarEventoActionPerformed(evt);
            }
        });
        MainMenu.add(BuscarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, -1, -1));

        tuner.setText("Administracion de Eventos");
        tuner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tunerActionPerformed(evt);
            }
        });
        MainMenu.add(tuner, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 860, 130));

        R.setText("RELIGIOSO");
        R.setPreferredSize(new java.awt.Dimension(407, 460));
        R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RActionPerformed(evt);
            }
        });
        MainMenu.add(R, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 260, -1, -1));

        D.setText("DEPORTIVO");
        D.setPreferredSize(new java.awt.Dimension(407, 460));
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });
        MainMenu.add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        M.setText("MUSICAL");
        M.setPreferredSize(new java.awt.Dimension(407, 460));
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });
        MainMenu.add(M, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, -1, -1));

        EliminarEvento.setText("Eliminar Evento");
        EliminarEvento.setPreferredSize(new java.awt.Dimension(407, 460));
        EliminarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarEventoActionPerformed(evt);
            }
        });
        MainMenu.add(EliminarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 260, -1, -1));

        EliminarUser.setText("Eliminar Usuario");
        EliminarUser.setPreferredSize(new java.awt.Dimension(407, 460));
        EliminarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarUserActionPerformed(evt);
            }
        });
        MainMenu.add(EliminarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 260, -1, -1));

        CREATOR.setBackground(new java.awt.Color(0, 0, 51));
        CREATOR.setPreferredSize(new java.awt.Dimension(1920, 940));
        CREATOR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BOTON_CREAR_EVENTOS.setText("Crear Evento");
        BOTON_CREAR_EVENTOS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BOTON_CREAR_EVENTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_CREAR_EVENTOSActionPerformed(evt);
            }
        });
        CREATOR.add(BOTON_CREAR_EVENTOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 650, 360, 150));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NOMBRE DEL EVENTO");
        CREATOR.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 140, -1));

        evName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CREATOR.add(evName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 230, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CODIGO");
        CREATOR.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, -1, -1));

        evCode.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CREATOR.add(evCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 230, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DESCRIPCION");
        CREATOR.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("RENTA");
        CREATOR.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 380, -1, -1));

        rent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CREATOR.add(rent, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, 230, 40));

        t1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 255, 255));
        t1.setText("EQUIPO 1");
        CREATOR.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, -1, -1));

        T1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CREATOR.add(T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 230, 40));

        t2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        t2.setForeground(new java.awt.Color(255, 255, 255));
        t2.setText("EQUIPO 2");
        CREATOR.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, -1, -1));

        T2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CREATOR.add(T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 230, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("FECHA");
        CREATOR.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 260, -1, -1));

        cantPeople.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CREATOR.add(cantPeople, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, 230, 40));

        desc.setColumns(20);
        desc.setRows(5);
        desc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(desc);

        CREATOR.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 400, 200));

        DEIT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CREATOR.add(DEIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 300, 230, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CANT PERSONAS");
        CREATOR.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, -1, -1));

        SPORT_COMBO.setBackground(new java.awt.Color(40, 40, 40));
        SPORT_COMBO.setMaximumRowCount(3);
        SPORT_COMBO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FUTBOL", "TENIS", "RUGBY", "BASEBALL", " " }));
        SPORT_COMBO.setSelectedItem(null);
        SPORT_COMBO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SPORT_COMBO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPORT_COMBOActionPerformed(evt);
            }
        });
        CREATOR.add(SPORT_COMBO, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 230, 40));

        MUSIC_COMBO.setBackground(new java.awt.Color(40, 40, 40));
        MUSIC_COMBO.setMaximumRowCount(4);
        MUSIC_COMBO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "POP", "ROCK", "RAP", "CLASICA", "REGGEATON", "OTRO", " " }));
        MUSIC_COMBO.setSelectedItem(null);
        MUSIC_COMBO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MUSIC_COMBO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MUSIC_COMBOActionPerformed(evt);
            }
        });
        CREATOR.add(MUSIC_COMBO, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 230, 40));

        sType.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sType.setForeground(new java.awt.Color(255, 255, 255));
        sType.setText("TIPO DE DEPORTE");
        CREATOR.add(sType, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 510, -1, -1));

        EVENT_DISPLAY.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 48)); // NOI18N
        EVENT_DISPLAY.setText("CREACION DE EVENTO DEPORTIVO");
        CREATOR.add(EVENT_DISPLAY, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 941, 114));

        MainMenu.add(CREATOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 940));

        DISPLAY_AND_EDIT.setBackground(new java.awt.Color(0, 0, 51));
        DISPLAY_AND_EDIT.setPreferredSize(new java.awt.Dimension(1920, 940));
        DISPLAY_AND_EDIT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("NOMBRE DEL EVENTO");
        DISPLAY_AND_EDIT.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 130, -1));

        title_disp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DISPLAY_AND_EDIT.add(title_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 230, 40));

        jLabel12.setText("CODIGO");
        DISPLAY_AND_EDIT.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, -1, -1));

        codigo_disp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DISPLAY_AND_EDIT.add(codigo_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 230, 40));

        jLabel15.setText("DESCRIPCION");
        DISPLAY_AND_EDIT.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        jLabel17.setText("RENTA");
        DISPLAY_AND_EDIT.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 390, -1, -1));

        renta_disp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DISPLAY_AND_EDIT.add(renta_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, 230, 40));

        t3.setText("EQUIPO 1");
        DISPLAY_AND_EDIT.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, -1, -1));

        T1_disp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DISPLAY_AND_EDIT.add(T1_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 230, 40));

        t4.setText("EQUIPO 2");
        DISPLAY_AND_EDIT.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 270, -1, -1));

        jLabel18.setText("FECHA");
        DISPLAY_AND_EDIT.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 270, -1, -1));

        desc_disp.setColumns(20);
        desc_disp.setRows(5);
        desc_disp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(desc_disp);

        DISPLAY_AND_EDIT.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 400, 200));

        DEIT_disp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DISPLAY_AND_EDIT.add(DEIT_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 300, 230, 40));

        INTS2.setText("INTEGRANTES EQUIPO 2");
        DISPLAY_AND_EDIT.add(INTS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 370, -1, -1));

        SPORTS_COMBO_disp.setBackground(new java.awt.Color(40, 40, 40));
        SPORTS_COMBO_disp.setMaximumRowCount(3);
        SPORTS_COMBO_disp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FUTBOL", "TENIS", "RUGBY", "BASEBALL", " " }));
        SPORTS_COMBO_disp.setSelectedItem(null);
        SPORTS_COMBO_disp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SPORTS_COMBO_disp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPORTS_COMBO_dispActionPerformed(evt);
            }
        });
        DISPLAY_AND_EDIT.add(SPORTS_COMBO_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 230, 40));

        Convertidos_disp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DISPLAY_AND_EDIT.add(Convertidos_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 230, 40));

        MUSIC_COMBO_disp.setBackground(new java.awt.Color(40, 40, 40));
        MUSIC_COMBO_disp.setMaximumRowCount(4);
        MUSIC_COMBO_disp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "POP", "ROCK", "RAP", "CLASICA", "REGGEATON", "OTRO", " " }));
        MUSIC_COMBO_disp.setSelectedItem(null);
        MUSIC_COMBO_disp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MUSIC_COMBO_disp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MUSIC_COMBO_dispActionPerformed(evt);
            }
        });
        DISPLAY_AND_EDIT.add(MUSIC_COMBO_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 230, 40));

        sType1.setText("TIPO DE DEPORTE");
        DISPLAY_AND_EDIT.add(sType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 520, -1, -1));

        jLabel20.setText("CANT PERSONAS");
        DISPLAY_AND_EDIT.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, -1, -1));

        INTS1.setText("INTEGRANTES EQUIPO 2");
        DISPLAY_AND_EDIT.add(INTS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 370, -1, -1));

        integrantes2_disp.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "FALTANTE", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        integrantes2_disp.setVisibleRowCount(11);
        jScrollPane3.setViewportView(integrantes2_disp);

        DISPLAY_AND_EDIT.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1710, 540, 150, 200));

        integrantes1_disp.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "FALTANTE", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        integrantes1_disp.setVisibleRowCount(11);
        jScrollPane8.setViewportView(integrantes1_disp);

        DISPLAY_AND_EDIT.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 480, 150, 200));

        EDITAR.setText("EDITAR");
        EDITAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITARActionPerformed(evt);
            }
        });
        DISPLAY_AND_EDIT.add(EDITAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 760, 290, 140));

        SAVE_EDIT.setText("GUARDAR");
        SAVE_EDIT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SAVE_EDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVE_EDITActionPerformed(evt);
            }
        });
        DISPLAY_AND_EDIT.add(SAVE_EDIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 800, 290, 100));

        CANCEL_EDIT.setText("CANCELAR");
        CANCEL_EDIT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CANCEL_EDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCEL_EDITActionPerformed(evt);
            }
        });
        DISPLAY_AND_EDIT.add(CANCEL_EDIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 800, 290, 100));

        musics_disp.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        musics_disp.setVisibleRowCount(11);
        jScrollPane9.setViewportView(musics_disp);

        DISPLAY_AND_EDIT.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 490, 180, 210));

        instruments_disp.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        instruments_disp.setVisibleRowCount(11);
        jScrollPane7.setViewportView(instruments_disp);

        DISPLAY_AND_EDIT.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 490, 150, 200));

        rent2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DISPLAY_AND_EDIT.add(rent2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, 230, 40));

        T2_disp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DISPLAY_AND_EDIT.add(T2_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 230, 40));

        Integrantes2Register.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DISPLAY_AND_EDIT.add(Integrantes2Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 390, 230, 40));

        musicosRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        musicosRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicosRegisterActionPerformed(evt);
            }
        });
        DISPLAY_AND_EDIT.add(musicosRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 390, 230, 40));

        instrumentosRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DISPLAY_AND_EDIT.add(instrumentosRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 390, 230, 40));

        Type_disp.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Type_disp.setText("EVENTO");
        DISPLAY_AND_EDIT.add(Type_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 660, 100));

        Integrantes1Register.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Integrantes1Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Integrantes1RegisterActionPerformed(evt);
            }
        });
        DISPLAY_AND_EDIT.add(Integrantes1Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 390, 230, 40));

        cantPersonas_disp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DISPLAY_AND_EDIT.add(cantPersonas_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, 230, 40));

        fecha_disp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fecha_disp.setText("dd/MM/yyyy");
        DISPLAY_AND_EDIT.add(fecha_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 300, 110, 40));
        DISPLAY_AND_EDIT.add(sportType_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 230, 40));
        DISPLAY_AND_EDIT.add(musicType_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 230, 40));

        MainMenu.add(DISPLAY_AND_EDIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        FLASH_CARDS.setBackground(new java.awt.Color(0, 0, 51));
        FLASH_CARDS.setPreferredSize(new java.awt.Dimension(1920, 940));
        FLASH_CARDS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B01.setText("jButton1");
        FLASH_CARDS.add(B01, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 230, 200));

        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });
        FLASH_CARDS.add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 430, 80));

        search_FC.setText("search");
        search_FC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_FCActionPerformed(evt);
            }
        });
        FLASH_CARDS.add(search_FC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 120, 250, 80));

        B00.setText("jButton1");
        FLASH_CARDS.add(B00, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 230, 200));

        B02.setText("jButton1");
        FLASH_CARDS.add(B02, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 260, 230, 200));

        B03.setText("jButton1");
        FLASH_CARDS.add(B03, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 260, 230, 200));

        B10.setText("jButton1");
        FLASH_CARDS.add(B10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 230, 200));

        B11.setText("jButton1");
        FLASH_CARDS.add(B11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, 230, 200));

        B12.setText("jButton1");
        FLASH_CARDS.add(B12, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 490, 230, 200));

        B13.setText("jButton1");
        FLASH_CARDS.add(B13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 490, 230, 200));

        MainMenu.add(FLASH_CARDS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 940));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        if (!usernameField.getText().isBlank() && !passwordField.getText().isBlank()) {

            if (toolKit.Login(usernameField.getText(), passwordField.getText(), usuarios)) {
                loggeado = usernameField.getText();
                usernameField.setText("");
                passwordField.setText("");
                System.out.println("passed!");
                System.out.println(loggeado);
                MainLogin.setVisible(false);
                MainMenu.setVisible(true);

            }

        } else {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
        }
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void CrearEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearEventoActionPerformed

        EliminarEvento.setVisible(false);
        BuscarEvento.setVisible(false);
        CrearEvento.setVisible(false);
        D.setVisible(true);
        R.setVisible(true);
        M.setVisible(true);
        tuner.setVisible(false);
    }//GEN-LAST:event_CrearEventoActionPerformed

    private void EliminarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarEventoActionPerformed
        CrearEvento.setVisible(false);

        BuscarEvento.setVisible(false);
        EliminarEvento.setVisible(false);
        tuner.setVisible(false);

    }//GEN-LAST:event_EliminarEventoActionPerformed

    private void tunerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tunerActionPerformed
        TUNER(CrearEvento, EliminarEvento, BuscarEvento, CrearUser, EditarUser, EliminarUser, tuner);
        CreateUserTemp.setVisible(false);

        CREATOR.setVisible(false);


    }//GEN-LAST:event_tunerActionPerformed

    private void CrearUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearUserActionPerformed
        this.CreateUserTemp.setVisible(true);
        this.CrearUser.setVisible(false);
        tuner.setVisible(false);


    }//GEN-LAST:event_CrearUserActionPerformed

    private void EditarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarUserActionPerformed
        this.EditarUser.setVisible(false);
        tuner.setVisible(false);

    }//GEN-LAST:event_EditarUserActionPerformed

    private void EliminarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarUserActionPerformed
        EliminarUser.setVisible(false);
        tuner.setVisible(false);

    }//GEN-LAST:event_EliminarUserActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed

        if (!fname.getText().isBlank() && !usuario.getText().isBlank() && AgeSelector.getSelectedItem() != null && autoridad.getSelectedItem() != null) {

            String range = autoridad.getSelectedItem().toString();
            String eda = AgeSelector.getSelectedItem().toString();
            int ed = Integer.parseInt(eda);

            toolKit.crear(fname.getText(), usuario.getText(), pw.getText(), range, ed, usuarios);
            CreateUserTemp.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Llene todos los campos solicitados");
        }

        fname.setText("");
        usuario.setText("");
        pw.setText("");


    }//GEN-LAST:event_createActionPerformed

    private void autoridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autoridadActionPerformed

    private void BOTON_CREAR_EVENTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_CREAR_EVENTOSActionPerformed

        dateSelected = DEIT.getDate();
        tipoDeporte tmp1 = getSport(this.SPORT_COMBO.getSelectedIndex());
        tipoMusica tmp2 = getMusic(this.MUSIC_COMBO.getSelectedIndex());

        switch (selection) {
            case DEPORTIVO:
                if (!evName.getText().isBlank() && !evCode.getText().isBlank() && !desc.getText().isBlank() && !cantPeople.getText().isBlank() && !T1.getText().isBlank() && !T2.getText().isBlank() && dateSelected != null
                        && this.SPORT_COMBO.getSelectedItem() != null) {
                    tk.createEvent(Integer.parseInt(cantPeople.getText()), Integer.parseInt(evCode.getText()), evName.getText(), desc.getText(),
                            Double.parseDouble(rent.getText()), tipoEvento.DEPORTIVO, tipoMusica.OTRO, tmp1, T1.getText(), T2.getText());

                    if (Evento.kiwi) {
                        clean();
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Llene todos los campos por favor");

                }
                break;
            case MUSICAL:
                if (!evName.getText().isBlank() && !evCode.getText().isBlank() && !desc.getText().isBlank() && !cantPeople.getText().isBlank() && dateSelected != null
                        && this.MUSIC_COMBO.getSelectedItem() != null) {

                    tk.createEvent(Integer.parseInt(cantPeople.getText()), Integer.parseInt(evCode.getText()), evName.getText(), desc.getText(),
                            Double.parseDouble(rent.getText()), tipoEvento.MUSICAL, tmp2, tipoDeporte.TENIS, "", "");

                    if (Evento.kiwi) {
                        clean();
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Llene todos los campos por favor");
                }
                break;
            case RELIGIOSO:
                if (!evName.getText().isBlank() && !evCode.getText().isBlank() && !desc.getText().isBlank() && !cantPeople.getText().isBlank() && dateSelected != null) {

                    tk.createEvent(Integer.parseInt(cantPeople.getText()), Integer.parseInt(evCode.getText()), evName.getText(), desc.getText(),
                            Double.parseDouble(rent.getText()), tipoEvento.RELIGIOSO, music, spa, "", "");

                    if (Evento.kiwi) {
                        clean();
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Llene todos los campos por favor");
                }
                break;
            default:
                break;
        }

    }//GEN-LAST:event_BOTON_CREAR_EVENTOSActionPerformed

    private void clean() {
        this.evName.setText(null);
        this.evCode.setText(null);
        this.desc.setText(null);
        this.rent.setText(null);
        this.cantPeople.setText(null);
        this.T1.setText(null);
        this.T2.setText(null);
        this.DEIT.setDate(null);
        this.SPORT_COMBO.setSelectedItem(null);
        this.MUSIC_COMBO.setSelectedItem(null);
    }
    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        D.setVisible(false);
        M.setVisible(false);
        R.setVisible(false);
        t1.setVisible(true);
        t2.setVisible(true);
        T1.setVisible(true);
        T2.setVisible(true);
        CREATOR.setVisible(true);
        selection = tipoEvento.DEPORTIVO;
        this.EVENT_DISPLAY.setText("CREACION DE EVENTO DEPORTIVO");
        this.sType.setText("DEPORTE");
        this.MUSIC_COMBO.setVisible(false);
        this.SPORT_COMBO.setVisible(true);


    }//GEN-LAST:event_DActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        M.setVisible(false);
        R.setVisible(false);
        D.setVisible(false);
        CREATOR.setVisible(true);
        selection = tipoEvento.MUSICAL;
        this.EVENT_DISPLAY.setText("CREACION DE EVENTO MUSICAL");
        this.sType.setText("TIPO DE MUSICA");
        this.MUSIC_COMBO.setVisible(true);
        this.SPORT_COMBO.setVisible(false);
        t1.setVisible(false);
        t2.setVisible(false);
        T1.setVisible(false);
        T2.setVisible(false);


    }//GEN-LAST:event_MActionPerformed

    private void RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RActionPerformed

        M.setVisible(false);
        R.setVisible(false);
        D.setVisible(false);
        CREATOR.setVisible(false);
        selection = tipoEvento.RELIGIOSO;
        this.EVENT_DISPLAY.setText("CREACION DE EVENTO RELIGIOSO");
        this.SPORT_COMBO.setVisible(false);
        this.MUSIC_COMBO.setVisible(false);

    }//GEN-LAST:event_RActionPerformed

    private void SPORT_COMBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPORT_COMBOActionPerformed

    }//GEN-LAST:event_SPORT_COMBOActionPerformed

    private void MUSIC_COMBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MUSIC_COMBOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MUSIC_COMBOActionPerformed

    private void BuscarEventoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarEventoMousePressed
        BuscarEvento.setLocation(CrearEvento.getLocation());
        CrearEvento.setVisible(false);

        EliminarEvento.setVisible(false);

    }//GEN-LAST:event_BuscarEventoMousePressed

    private void BACK2MENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACK2MENUActionPerformed
        D.setVisible(false);
        R.setVisible(false);
        M.setVisible(false);
        this.CREATOR.setVisible(false);
        this.evName.setText(null);
        this.evCode.setText(null);
        this.desc.setText(null);
        this.rent.setText(null);
        this.cantPeople.setText(null);
        this.T1.setText(null);
        this.T2.setText(null);
        this.DEIT.setDate(null);
        this.SPORT_COMBO.setSelectedItem(null);
        this.MUSIC_COMBO.setSelectedItem(null);
        this.CreateUserTemp.setVisible(false);
        this.tuner.setVisible(true);
        this.tuner.setText("Administracion de Eventos");
        this.CrearEvento.setVisible(true);
        this.FLASH_CARDS.setVisible(false);

        this.BuscarEvento.setVisible(true);
        this.EliminarEvento.setVisible(true);
    }//GEN-LAST:event_BACK2MENUActionPerformed

    private void search_FCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_FCActionPerformed

        JButton[] flashCards = {B00, B01, B02, B03, B10, B11, B12, B13};
        for (int i = 0; i < flashCards.length; i++) {
            flashCards[i].setVisible(false);
        }
        int codigo;
        if (!busqueda.getText().isEmpty() && Integer.parseInt(busqueda.getText()) > 0) {
            codigo = Integer.parseInt(busqueda.getText());
            Evento ev = tk.searchEvent(codigo);
            if (ev != null) {
                EventoDeportivo tp;
                EventoMusical tp2;
                EventoReligioso tp3;

                switch (ev.eventoTipo) {
                    case DEPORTIVO:
                        tp = (EventoDeportivo) ev;
                        this.FLASH_CARDS.setVisible(false);
                        this.DISPLAY_AND_EDIT.setVisible(true);
                        tp.printEvent(codigo, this.renta_disp, this.Type_disp, this.cantPersonas_disp, this.codigo_disp, this.title_disp, this.desc_disp, this.fecha_disp,
                                this.T1_disp, this.T2_disp, this.integrantes1_disp, this.integrantes2_disp, this.sportType_disp, this.sportType_disp, this.musics_disp, this.Convertidos_disp);

                        break;
                    case MUSICAL:
                        tp2 = (EventoMusical) ev;
                        break;
                    case RELIGIOSO:
                        tp3 = (EventoReligioso) ev;
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "NO SE HA ENCONTRADO UN EVENTO CON ESTE CODIGO");
            }

        } else {
            JOptionPane.showMessageDialog(null, "INGRESE UN CODIGO VALIDO");
        }
       

    }//GEN-LAST:event_search_FCActionPerformed

    private void BuscarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarEventoActionPerformed
        FLASH_CARDS.setVisible(true);
        this.tuner.setVisible(false);
        this.BuscarEvento.setVisible(false);
        this.setCards(musical, deportivo, religioso);


    }//GEN-LAST:event_BuscarEventoActionPerformed

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busquedaActionPerformed

    private void CANCEL_EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCEL_EDITActionPerformed

    }//GEN-LAST:event_CANCEL_EDITActionPerformed

    private void SPORTS_COMBO_dispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPORTS_COMBO_dispActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SPORTS_COMBO_dispActionPerformed

    private void MUSIC_COMBO_dispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MUSIC_COMBO_dispActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MUSIC_COMBO_dispActionPerformed

    private void EDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITARActionPerformed
        editable = true;
        this.SAVE_EDIT.setVisible(false);
        this.CANCEL_EDIT.setVisible(true);
        this.MainMenu.setVisible(true);
        this.DISPLAY_AND_EDIT.setVisible(false);


    }//GEN-LAST:event_EDITARActionPerformed

    private void SAVE_EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVE_EDITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SAVE_EDITActionPerformed

    private void buscarProvisionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProvisionalActionPerformed

    }//GEN-LAST:event_buscarProvisionalActionPerformed

    private void musicosRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicosRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_musicosRegisterActionPerformed

    private void Integrantes1RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Integrantes1RegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Integrantes1RegisterActionPerformed

    public tipoMusica getMusic(int a) {

        tipoMusica tempMT = null;

        switch (a) {
            case 0:
                tempMT = tipoMusica.POP;
                break;
            case 1:
                tempMT = tipoMusica.ROCK;
                break;
            case 2:
                tempMT = tipoMusica.RAP;
                break;
            case 3:
                tempMT = tipoMusica.CLASICA;
                break;
            case 4:
                tempMT = tipoMusica.REGGEATON;
                break;
            case 5:
                tempMT = tipoMusica.OTRO;
        }
        return tempMT;
    }

    public tipoDeporte getSport(int a) {
        tipoDeporte tempSP = null;

        switch (a) {
            case 0:
                tempSP = tipoDeporte.FUTBOL;
                break;
            case 1:
                tempSP = tipoDeporte.TENIS;
                break;
            case 2:
                tempSP = tipoDeporte.RUGBY;
                break;
            case 3:
                tempSP = tipoDeporte.BASEBALL;
                break;
        }
        return tempSP;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sistema.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AgeSelector;
    private javax.swing.JButton B00;
    private javax.swing.JButton B01;
    private javax.swing.JButton B02;
    private javax.swing.JButton B03;
    private javax.swing.JButton B10;
    private javax.swing.JButton B11;
    private javax.swing.JButton B12;
    private javax.swing.JButton B13;
    private javax.swing.JButton BACK2MENU;
    private javax.swing.JPanel BAR;
    private javax.swing.JToggleButton BOTON_CREAR_EVENTOS;
    private javax.swing.JButton BuscarEvento;
    private javax.swing.JToggleButton CANCEL_EDIT;
    private javax.swing.JPanel CREATOR;
    private javax.swing.JTextField Convertidos_disp;
    private javax.swing.JButton CrearEvento;
    private javax.swing.JButton CrearUser;
    private javax.swing.JPanel CreateUserTemp;
    private javax.swing.JButton D;
    private com.toedter.calendar.JDateChooser DEIT;
    private com.toedter.calendar.JDateChooser DEIT_disp;
    private javax.swing.JPanel DISPLAY_AND_EDIT;
    private javax.swing.JToggleButton EDITAR;
    private javax.swing.JLabel EVENT_DISPLAY;
    private javax.swing.JButton EditarUser;
    private javax.swing.JButton EliminarEvento;
    private javax.swing.JButton EliminarUser;
    private javax.swing.JPanel FLASH_CARDS;
    private javax.swing.JLabel INTS1;
    private javax.swing.JLabel INTS2;
    private javax.swing.JTextField Integrantes1Register;
    private javax.swing.JTextField Integrantes2Register;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JButton M;
    private javax.swing.JComboBox<String> MUSIC_COMBO;
    private javax.swing.JComboBox<String> MUSIC_COMBO_disp;
    private javax.swing.JPanel MainLogin;
    private javax.swing.JPanel MainMenu;
    private javax.swing.JButton R;
    private javax.swing.JLabel RealTime;
    private javax.swing.JToggleButton SAVE_EDIT;
    private javax.swing.JComboBox<String> SPORTS_COMBO_disp;
    private javax.swing.JComboBox<String> SPORT_COMBO;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T1_disp;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T2_disp;
    private javax.swing.JLabel Type_disp;
    private javax.swing.JComboBox<String> autoridad;
    private javax.swing.JButton buscarProvisional;
    private javax.swing.JTextField busqueda;
    private javax.swing.JTextField cantPeople;
    private javax.swing.JTextField cantPersonas_disp;
    private javax.swing.JTextField codigo_disp;
    private javax.swing.JToggleButton create;
    private javax.swing.JTextArea desc;
    private javax.swing.JTextArea desc_disp;
    private javax.swing.JTextField evCode;
    private javax.swing.JTextField evName;
    private javax.swing.JLabel fecha_disp;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField instrumentosRegister;
    private javax.swing.JList<String> instruments_disp;
    private javax.swing.JList<String> integrantes1_disp;
    private javax.swing.JList<String> integrantes2_disp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel musicType_disp;
    private javax.swing.JTextField musicosRegister;
    private javax.swing.JList<String> musics_disp;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField pw;
    private javax.swing.JTextField rent;
    private javax.swing.JTextField rent2;
    private javax.swing.JTextField renta_disp;
    private javax.swing.JLabel sType;
    private javax.swing.JLabel sType1;
    private javax.swing.JButton search_FC;
    private javax.swing.JLabel sportType_disp;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    private javax.swing.JTextField title_disp;
    private javax.swing.JButton tuner;
    private javax.swing.JTextField usernameField;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
