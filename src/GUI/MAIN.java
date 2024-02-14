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
import Usuarios.Administrador;
import Usuarios.Contenidos;
import Usuarios.Default;
import Usuarios.Limitado;
import Usuarios.Usuario;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.HeadlessException;
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
public class MAIN extends javax.swing.JFrame implements Cardeable {

    public static Usuario UserTK = new Usuario("", "", "", 0);

    public static Calendar GLOBAL;
    public static SimpleDateFormat fechaNeitor;
    public static Date dateSelected;

    public static Usuario loggeado;
    private Evento tk;

    private final String fullName;
    private final String username;
    private final String password;
    private final int age;
    private tipoEvento selection;
    private tipoDeporte sport;
    private tipoMusica music;
    private tipoDeporte spa;
    private ImageIcon musical;
    private ImageIcon deportivo;
    private ImageIcon religioso;
    private ImageIcon home;
    private ImageIcon logout;
    private ImageIcon profile;
    private ImageIcon reports;
    private boolean editable;
    private ArrayList<String> prov1 = new ArrayList();
    private ArrayList<String> prov2 = new ArrayList();
    private ArrayList<String> p1 = new ArrayList();
    private ArrayList<String> p2 = new ArrayList();
    private ArrayList<String> m = new ArrayList();

    public static ArrayList<Evento> realizados = new ArrayList();
    public static ArrayList<Evento> futuros = new ArrayList();
    public static ArrayList<Evento> cancelados = new ArrayList();

    private Evento savedEventData; //Guarda la info del evento en caso de que el usuario le de a cancelar edicion del evento
    private Usuario savedUserData;
    private Usuario savedLoggedData;
    private int savedCode;

    public MAIN() throws NullPointerException {
        this.age = 33;
        this.password = "supersecreto";
        this.fullName = "INGE";
        this.username = "admin";

        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        fechaNeitor = new SimpleDateFormat("dd/MM/yyyy");
        GLOBAL = Calendar.getInstance();
        this.RealTime.setText(fechaNeitor.format(GLOBAL.getTime()));
        tk = new Evento(0, -1, "", "", 0.0);

        UserTK.users.add(new Default(fullName, username, password, age));
        initWindows();
        this.AgeSelector.setSelectedItem(null);
        this.autoridad.setSelectedItem(null);

        editable = false;
        initWindows();

    }

//MISC METHODS
//Could be implemented with an interface
    public final void initWindows() {
        MainLogin.setVisible(true);
        MainMenu.setVisible(false);
        CrearUser.setVisible(false);
        EditarUser.setVisible(false);
        EliminarUser.setVisible(false);
        USER_CREATOR.setVisible(false);
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
        this.addMusician.setVisible(false);
        this.addP1.setVisible(false);
        this.addP2.setVisible(false);
        this.integrantes1_disp.setVisible(false);
        this.integrantes2_disp.setVisible(false);
        this.DeleteSearch.setVisible(false);
        this.searchDelete.setVisible(false);
        this.tuner.setText("Administracion de Eventos");
        this.USER_CREATOR.setVisible(false);
        this.EDIT_USER.setVisible(false);
        userFinder.setVisible(false);
        userFinderBUTTON.setVisible(false);
        this.save_changes.setVisible(false);
        this.cancel_changes.setVisible(false);
        this.VIEW_PROFILE.setVisible(false);
        this.REPORTS.setVisible(false);
        this.VIEW_PROFILE.setVisible(false);

    }

    @Override
    public void setCards(ImageIcon music, ImageIcon sport, ImageIcon religious) {

        if (eventos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "AUN NO SE HAN CREADO EVENTOS");
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

        MainLogin = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        LoginBtn = new javax.swing.JButton();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        MainMenu = new javax.swing.JPanel();
        RealTime = new javax.swing.JLabel();
        R = new javax.swing.JButton();
        D = new javax.swing.JButton();
        M = new javax.swing.JButton();
        EliminarEvento = new javax.swing.JButton();
        EliminarUser = new javax.swing.JButton();
        CrearUser = new javax.swing.JButton();
        EditarUser = new javax.swing.JButton();
        CrearEvento = new javax.swing.JButton();
        BuscarEvento = new javax.swing.JButton();
        BAR = new javax.swing.JPanel();
        BACK2MENU = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        VER_PERFIL = new javax.swing.JButton();
        reports_BUTTON = new javax.swing.JButton();
        tuner = new javax.swing.JButton();
        DeleteSearch = new javax.swing.JTextField();
        searchDelete = new javax.swing.JButton();
        userFinder = new javax.swing.JTextField();
        userFinderBUTTON = new javax.swing.JButton();
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
        list1 = new javax.swing.JScrollPane();
        integrantes2_disp = new javax.swing.JList<>();
        list2 = new javax.swing.JScrollPane();
        integrantes1_disp = new javax.swing.JList<>();
        EDITAR = new javax.swing.JToggleButton();
        SAVE_EDIT = new javax.swing.JToggleButton();
        CANCEL_EDIT = new javax.swing.JToggleButton();
        list3 = new javax.swing.JScrollPane();
        musics_disp = new javax.swing.JList<>();
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
        addP1 = new javax.swing.JButton();
        addP2 = new javax.swing.JButton();
        addMusician = new javax.swing.JButton();
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
        USER_CREATOR = new javax.swing.JPanel();
        fname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pw = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        AgeSelector = new javax.swing.JComboBox<>();
        CREATE_USER = new javax.swing.JToggleButton();
        autoridad = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        EDIT_USER = new javax.swing.JPanel();
        fname_disp = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        usuario_disp = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        pw_disp = new javax.swing.JTextField();
        auth = new javax.swing.JLabel();
        AgeSelector_disp = new javax.swing.JComboBox<>();
        user_edit = new javax.swing.JToggleButton();
        autoridad_disp = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        save_changes = new javax.swing.JToggleButton();
        cancel_changes = new javax.swing.JToggleButton();
        VIEW_PROFILE = new javax.swing.JPanel();
        loggedFNAME = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        loggedUSER = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        loggedPW = new javax.swing.JTextField();
        auth1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        creadosLogged = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        loggedAUTH = new javax.swing.JTextField();
        loggedAGE = new javax.swing.JTextField();
        REPORTS = new javax.swing.JTabbedPane();
        REPORTES_REALIZADOS = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        realizados_disp = new javax.swing.JTextArea();
        jLabel46 = new javax.swing.JLabel();
        REPORTES_FUTUROS = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        futuros_disp = new javax.swing.JTextArea();
        jLabel45 = new javax.swing.JLabel();
        REPORTES_CANCELADOS = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        cancelados_disp = new javax.swing.JTextArea();
        jLabel44 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));

        MainLogin.setBackground(new java.awt.Color(0, 51, 102));
        MainLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("USUARIO");
        MainLogin.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 310, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("CONTRASEÑA");
        MainLogin.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 450, -1, -1));

        LoginBtn.setBackground(new java.awt.Color(0, 153, 153));
        LoginBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(0, 0, 0));
        LoginBtn.setText("Iniciar Sesion");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        MainLogin.add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 630, 330, 90));
        MainLogin.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, 370, 70));
        MainLogin.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 510, 370, 70));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Assets/LOGIN_WP.png"))); // NOI18N
        MainLogin.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2450, 1260));

        MainMenu.setBackground(new java.awt.Color(204, 255, 255));
        MainMenu.setPreferredSize(new java.awt.Dimension(1920, 1080));
        MainMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RealTime.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        RealTime.setForeground(new java.awt.Color(0, 0, 0));
        RealTime.setText("DD/MM/YY");
        MainMenu.add(RealTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 30, 220, -1));

        R.setBackground(new java.awt.Color(0, 204, 204));
        R.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        R.setForeground(new java.awt.Color(0, 0, 0));
        R.setText("RELIGIOSO");
        R.setPreferredSize(new java.awt.Dimension(407, 460));
        R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RActionPerformed(evt);
            }
        });
        MainMenu.add(R, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 380, -1, 220));

        D.setBackground(new java.awt.Color(0, 204, 204));
        D.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        D.setForeground(new java.awt.Color(0, 0, 0));
        D.setText("DEPORTIVO");
        D.setPreferredSize(new java.awt.Dimension(407, 460));
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });
        MainMenu.add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, 220));

        M.setBackground(new java.awt.Color(0, 204, 204));
        M.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        M.setForeground(new java.awt.Color(0, 0, 0));
        M.setText("MUSICAL");
        M.setPreferredSize(new java.awt.Dimension(407, 460));
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });
        MainMenu.add(M, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, -1, 220));

        EliminarEvento.setBackground(new java.awt.Color(0, 204, 204));
        EliminarEvento.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        EliminarEvento.setForeground(new java.awt.Color(0, 0, 0));
        EliminarEvento.setText("Eliminar Evento");
        EliminarEvento.setPreferredSize(new java.awt.Dimension(407, 460));
        EliminarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarEventoActionPerformed(evt);
            }
        });
        MainMenu.add(EliminarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 380, -1, 220));

        EliminarUser.setBackground(new java.awt.Color(0, 204, 204));
        EliminarUser.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        EliminarUser.setForeground(new java.awt.Color(0, 0, 0));
        EliminarUser.setText("Eliminar Usuario");
        EliminarUser.setPreferredSize(new java.awt.Dimension(407, 460));
        EliminarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarUserActionPerformed(evt);
            }
        });
        MainMenu.add(EliminarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 380, -1, 220));

        CrearUser.setBackground(new java.awt.Color(0, 204, 204));
        CrearUser.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        CrearUser.setForeground(new java.awt.Color(0, 0, 0));
        CrearUser.setText("Crear Usuario");
        CrearUser.setPreferredSize(new java.awt.Dimension(407, 460));
        CrearUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearUserActionPerformed(evt);
            }
        });
        MainMenu.add(CrearUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, 220));

        EditarUser.setBackground(new java.awt.Color(0, 204, 204));
        EditarUser.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        EditarUser.setForeground(new java.awt.Color(0, 0, 0));
        EditarUser.setText("Editar Usuario");
        EditarUser.setPreferredSize(new java.awt.Dimension(407, 460));
        EditarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarUserActionPerformed(evt);
            }
        });
        MainMenu.add(EditarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, -1, 220));

        CrearEvento.setBackground(new java.awt.Color(0, 204, 204));
        CrearEvento.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        CrearEvento.setForeground(new java.awt.Color(0, 0, 0));
        CrearEvento.setText("Crear Evento");
        CrearEvento.setPreferredSize(new java.awt.Dimension(407, 460));
        CrearEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearEventoActionPerformed(evt);
            }
        });
        MainMenu.add(CrearEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, 220));

        BuscarEvento.setBackground(new java.awt.Color(0, 204, 204));
        BuscarEvento.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        BuscarEvento.setForeground(new java.awt.Color(0, 0, 0));
        BuscarEvento.setText("Buscar Evento");
        BuscarEvento.setPreferredSize(new java.awt.Dimension(407, 460));
        BuscarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarEventoActionPerformed(evt);
            }
        });
        MainMenu.add(BuscarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, -1, 220));

        BAR.setBackground(new java.awt.Color(0, 51, 51));
        BAR.setLayout(new java.awt.GridBagLayout());

        BACK2MENU.setBackground(new java.awt.Color(0, 51, 51));
        BACK2MENU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/barIcons/homeLogo.png"))); // NOI18N
        BACK2MENU.setText("HOME");
        BACK2MENU.setPreferredSize(new java.awt.Dimension(120, 120));
        BACK2MENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACK2MENUActionPerformed(evt);
            }
        });
        BAR.add(BACK2MENU, new java.awt.GridBagConstraints());

        EXIT.setBackground(new java.awt.Color(0, 51, 51));
        EXIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/barIcons/logoutLogo.png"))); // NOI18N
        EXIT.setText("LOGOUT");
        EXIT.setPreferredSize(new java.awt.Dimension(120, 120));
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });
        BAR.add(EXIT, new java.awt.GridBagConstraints());

        VER_PERFIL.setBackground(new java.awt.Color(0, 51, 51));
        VER_PERFIL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/barIcons/profileLogo.png"))); // NOI18N
        VER_PERFIL.setText("VER PERFIL");
        VER_PERFIL.setPreferredSize(new java.awt.Dimension(120, 120));
        VER_PERFIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VER_PERFILActionPerformed(evt);
            }
        });
        BAR.add(VER_PERFIL, new java.awt.GridBagConstraints());

        reports_BUTTON.setBackground(new java.awt.Color(0, 51, 51));
        reports_BUTTON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/barIcons/reportsLogo.png"))); // NOI18N
        reports_BUTTON.setText("REPORTES");
        reports_BUTTON.setPreferredSize(new java.awt.Dimension(120, 120));
        reports_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reports_BUTTONActionPerformed(evt);
            }
        });
        BAR.add(reports_BUTTON, new java.awt.GridBagConstraints());

        MainMenu.add(BAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 938, 1920, 120));

        tuner.setBackground(new java.awt.Color(0, 102, 102));
        tuner.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        tuner.setForeground(new java.awt.Color(0, 0, 0));
        tuner.setText("Administracion de Eventos");
        tuner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tunerActionPerformed(evt);
            }
        });
        MainMenu.add(tuner, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 860, 130));

        DeleteSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteSearchActionPerformed(evt);
            }
        });
        MainMenu.add(DeleteSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, 430, 80));

        searchDelete.setBackground(new java.awt.Color(0, 153, 153));
        searchDelete.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        searchDelete.setForeground(new java.awt.Color(0, 0, 0));
        searchDelete.setText("ELIMINAR");
        searchDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDeleteActionPerformed(evt);
            }
        });
        MainMenu.add(searchDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, 250, 80));

        userFinder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFinderActionPerformed(evt);
            }
        });
        MainMenu.add(userFinder, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, 430, 80));

        userFinderBUTTON.setBackground(new java.awt.Color(0, 153, 153));
        userFinderBUTTON.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        userFinderBUTTON.setForeground(new java.awt.Color(0, 0, 0));
        userFinderBUTTON.setText("BUSCAR");
        userFinderBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFinderBUTTONActionPerformed(evt);
            }
        });
        MainMenu.add(userFinderBUTTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, 250, 80));

        CREATOR.setBackground(new java.awt.Color(204, 255, 255));
        CREATOR.setPreferredSize(new java.awt.Dimension(1920, 940));
        CREATOR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BOTON_CREAR_EVENTOS.setBackground(new java.awt.Color(0, 153, 153));
        BOTON_CREAR_EVENTOS.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        BOTON_CREAR_EVENTOS.setForeground(new java.awt.Color(0, 0, 0));
        BOTON_CREAR_EVENTOS.setText("Crear Evento");
        BOTON_CREAR_EVENTOS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BOTON_CREAR_EVENTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_CREAR_EVENTOSActionPerformed(evt);
            }
        });
        CREATOR.add(BOTON_CREAR_EVENTOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 650, 360, 150));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("NOMBRE DEL EVENTO");
        CREATOR.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 210, -1));

        evName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CREATOR.add(evName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 230, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("CODIGO");
        CREATOR.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 140, -1));

        evCode.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CREATOR.add(evCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 230, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("DESCRIPCION");
        CREATOR.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 190, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("RENTA");
        CREATOR.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 380, 130, -1));

        rent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CREATOR.add(rent, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, 230, 40));

        t1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        t1.setForeground(new java.awt.Color(0, 0, 0));
        t1.setText("EQUIPO 1");
        CREATOR.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 150, -1));

        T1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CREATOR.add(T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 230, 40));

        t2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        t2.setForeground(new java.awt.Color(0, 0, 0));
        t2.setText("EQUIPO 2");
        CREATOR.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, 150, -1));

        T2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CREATOR.add(T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 230, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("FECHA");
        CREATOR.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 260, 130, -1));

        cantPeople.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cantPeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantPeopleActionPerformed(evt);
            }
        });
        CREATOR.add(cantPeople, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, 230, 40));

        desc.setColumns(20);
        desc.setRows(5);
        desc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(desc);

        CREATOR.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 400, 200));

        DEIT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CREATOR.add(DEIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 300, 230, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("CANT PERSONAS");
        CREATOR.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, 220, -1));

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

        sType.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        sType.setForeground(new java.awt.Color(0, 0, 0));
        sType.setText("TIPO DE DEPORTE");
        CREATOR.add(sType, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 510, 230, -1));

        EVENT_DISPLAY.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        EVENT_DISPLAY.setForeground(new java.awt.Color(0, 0, 0));
        EVENT_DISPLAY.setText("CREACION DE EVENTO DEPORTIVO");
        CREATOR.add(EVENT_DISPLAY, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 941, 114));

        MainMenu.add(CREATOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 940));

        DISPLAY_AND_EDIT.setBackground(new java.awt.Color(204, 255, 255));
        DISPLAY_AND_EDIT.setPreferredSize(new java.awt.Dimension(1920, 940));
        DISPLAY_AND_EDIT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("NOMBRE DEL EVENTO");
        DISPLAY_AND_EDIT.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 200, -1));

        title_disp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DISPLAY_AND_EDIT.add(title_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 230, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("CODIGO");
        DISPLAY_AND_EDIT.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 150, -1));

        codigo_disp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DISPLAY_AND_EDIT.add(codigo_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 230, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("DESCRIPCION");
        DISPLAY_AND_EDIT.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 200, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("RENTA");
        DISPLAY_AND_EDIT.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, 140, -1));

        renta_disp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DISPLAY_AND_EDIT.add(renta_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, 230, 40));

        t3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        t3.setForeground(new java.awt.Color(0, 0, 0));
        t3.setText("EQUIPO 1");
        DISPLAY_AND_EDIT.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 160, -1));

        T1_disp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DISPLAY_AND_EDIT.add(T1_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 230, 40));

        t4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        t4.setForeground(new java.awt.Color(0, 0, 0));
        t4.setText("EQUIPO 2");
        DISPLAY_AND_EDIT.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 260, 160, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("FECHA");
        DISPLAY_AND_EDIT.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 260, 130, -1));

        desc_disp.setColumns(20);
        desc_disp.setRows(5);
        desc_disp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(desc_disp);

        DISPLAY_AND_EDIT.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 400, 200));

        DEIT_disp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DISPLAY_AND_EDIT.add(DEIT_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 300, 230, 40));

        INTS2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        INTS2.setForeground(new java.awt.Color(0, 0, 0));
        INTS2.setText("INTEGRANTES EQUIPO 2");
        DISPLAY_AND_EDIT.add(INTS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 360, 290, -1));

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

        sType1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        sType1.setForeground(new java.awt.Color(0, 0, 0));
        sType1.setText("TIPO DE DEPORTE");
        DISPLAY_AND_EDIT.add(sType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 510, 230, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("CANT PERSONAS");
        DISPLAY_AND_EDIT.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 230, -1));

        INTS1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        INTS1.setForeground(new java.awt.Color(0, 0, 0));
        INTS1.setText("INTEGRANTES EQUIPO 2");
        DISPLAY_AND_EDIT.add(INTS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 360, 290, -1));

        integrantes2_disp.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "NO DISPONIBLE", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        integrantes2_disp.setVisibleRowCount(11);
        list1.setViewportView(integrantes2_disp);

        DISPLAY_AND_EDIT.add(list1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 390, 230, 210));

        integrantes1_disp.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "NO DISPONIBLE", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        integrantes1_disp.setVisibleRowCount(11);
        list2.setViewportView(integrantes1_disp);

        DISPLAY_AND_EDIT.add(list2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 390, 230, 210));

        EDITAR.setBackground(new java.awt.Color(0, 153, 153));
        EDITAR.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        EDITAR.setForeground(new java.awt.Color(0, 0, 0));
        EDITAR.setText("EDITAR");
        EDITAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITARActionPerformed(evt);
            }
        });
        DISPLAY_AND_EDIT.add(EDITAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 760, 290, 140));

        SAVE_EDIT.setBackground(new java.awt.Color(0, 153, 153));
        SAVE_EDIT.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        SAVE_EDIT.setForeground(new java.awt.Color(0, 0, 0));
        SAVE_EDIT.setText("GUARDAR");
        SAVE_EDIT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SAVE_EDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVE_EDITActionPerformed(evt);
            }
        });
        DISPLAY_AND_EDIT.add(SAVE_EDIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 800, 290, 100));

        CANCEL_EDIT.setBackground(new java.awt.Color(0, 153, 153));
        CANCEL_EDIT.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        CANCEL_EDIT.setForeground(new java.awt.Color(0, 0, 0));
        CANCEL_EDIT.setText("CANCELAR");
        CANCEL_EDIT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CANCEL_EDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCEL_EDITActionPerformed(evt);
            }
        });
        DISPLAY_AND_EDIT.add(CANCEL_EDIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 800, 290, 100));

        musics_disp.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "NO DISPONIBLE", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        musics_disp.setVisibleRowCount(11);
        list3.setViewportView(musics_disp);

        DISPLAY_AND_EDIT.add(list3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 390, 230, 210));

        rent2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DISPLAY_AND_EDIT.add(rent2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, 230, 40));

        T2_disp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DISPLAY_AND_EDIT.add(T2_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 230, 40));

        Integrantes2Register.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DISPLAY_AND_EDIT.add(Integrantes2Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 390, 230, 40));

        musicosRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        musicosRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicosRegisterActionPerformed(evt);
            }
        });
        DISPLAY_AND_EDIT.add(musicosRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 390, 230, 40));

        instrumentosRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        instrumentosRegister.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                instrumentosRegisterKeyPressed(evt);
            }
        });
        DISPLAY_AND_EDIT.add(instrumentosRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 480, 230, 40));

        Type_disp.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        Type_disp.setForeground(new java.awt.Color(0, 0, 0));
        Type_disp.setText("EVENTO");
        DISPLAY_AND_EDIT.add(Type_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 730, 100));

        Integrantes1Register.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Integrantes1Register.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Integrantes1RegisterKeyPressed(evt);
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

        addP1.setBackground(new java.awt.Color(0, 153, 153));
        addP1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        addP1.setForeground(new java.awt.Color(0, 0, 0));
        addP1.setText("Añadir");
        addP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addP1ActionPerformed(evt);
            }
        });
        DISPLAY_AND_EDIT.add(addP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 440, 110, 50));

        addP2.setBackground(new java.awt.Color(0, 153, 153));
        addP2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        addP2.setForeground(new java.awt.Color(0, 0, 0));
        addP2.setText("Añadir");
        addP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addP2ActionPerformed(evt);
            }
        });
        DISPLAY_AND_EDIT.add(addP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 440, 110, 50));

        addMusician.setBackground(new java.awt.Color(0, 153, 153));
        addMusician.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        addMusician.setForeground(new java.awt.Color(0, 0, 0));
        addMusician.setText("Añadir");
        addMusician.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMusicianActionPerformed(evt);
            }
        });
        DISPLAY_AND_EDIT.add(addMusician, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 420, 110, 60));

        MainMenu.add(DISPLAY_AND_EDIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        FLASH_CARDS.setBackground(new java.awt.Color(204, 255, 255));
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

        search_FC.setBackground(new java.awt.Color(0, 153, 153));
        search_FC.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        search_FC.setForeground(new java.awt.Color(0, 0, 0));
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

        USER_CREATOR.setBackground(new java.awt.Color(204, 255, 255));
        USER_CREATOR.setForeground(new java.awt.Color(102, 102, 102));
        USER_CREATOR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        USER_CREATOR.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 450, 80));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre Completo");
        USER_CREATOR.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre de Usuario");
        USER_CREATOR.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));
        USER_CREATOR.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 450, 80));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contraseña");
        USER_CREATOR.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, -1, -1));
        USER_CREATOR.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 450, 80));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Autoridad");
        USER_CREATOR.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 250, -1, -1));

        AgeSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", " " }));
        AgeSelector.setSelectedItem(null);
        USER_CREATOR.add(AgeSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, 160, 70));

        CREATE_USER.setBackground(new java.awt.Color(0, 153, 153));
        CREATE_USER.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        CREATE_USER.setForeground(new java.awt.Color(0, 0, 0));
        CREATE_USER.setText("Crear Usuario");
        CREATE_USER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREATE_USERActionPerformed(evt);
            }
        });
        USER_CREATOR.add(CREATE_USER, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 650, 310, 140));

        autoridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Contenidos", "Limitado" }));
        autoridad.setSelectedItem(null);
        autoridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoridadActionPerformed(evt);
            }
        });
        USER_CREATOR.add(autoridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 290, 210, 70));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Edad");
        USER_CREATOR.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 250, -1, -1));

        MainMenu.add(USER_CREATOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 940));

        EDIT_USER.setBackground(new java.awt.Color(204, 255, 255));
        EDIT_USER.setForeground(new java.awt.Color(0, 0, 0));
        EDIT_USER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fname_disp.setEnabled(false);
        EDIT_USER.add(fname_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 430, 70));

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Nombre Completo");
        EDIT_USER.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Nombre de Usuario");
        EDIT_USER.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        usuario_disp.setEnabled(false);
        EDIT_USER.add(usuario_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 430, 70));

        jLabel21.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Contraseña");
        EDIT_USER.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, -1));

        pw_disp.setEnabled(false);
        EDIT_USER.add(pw_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 430, 70));

        auth.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        auth.setForeground(new java.awt.Color(0, 0, 0));
        auth.setText("Autoridad");
        EDIT_USER.add(auth, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 220, -1, -1));

        AgeSelector_disp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", " " }));
        AgeSelector_disp.setSelectedItem(null);
        AgeSelector_disp.setEnabled(false);
        EDIT_USER.add(AgeSelector_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, 170, 70));

        user_edit.setBackground(new java.awt.Color(0, 153, 153));
        user_edit.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        user_edit.setForeground(new java.awt.Color(0, 0, 0));
        user_edit.setText("EDITAR");
        user_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_editActionPerformed(evt);
            }
        });
        EDIT_USER.add(user_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, 220, 80));

        autoridad_disp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Contenidos", "Limitado" }));
        autoridad_disp.setSelectedItem(null);
        autoridad_disp.setEnabled(false);
        autoridad_disp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoridad_dispActionPerformed(evt);
            }
        });
        EDIT_USER.add(autoridad_disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 260, 170, 70));

        jLabel23.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Edad");
        EDIT_USER.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, -1, -1));

        save_changes.setBackground(new java.awt.Color(0, 153, 153));
        save_changes.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        save_changes.setForeground(new java.awt.Color(0, 0, 0));
        save_changes.setText("GUARDAR");
        save_changes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_changesActionPerformed(evt);
            }
        });
        EDIT_USER.add(save_changes, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, 220, 80));

        cancel_changes.setBackground(new java.awt.Color(0, 153, 153));
        cancel_changes.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        cancel_changes.setForeground(new java.awt.Color(0, 0, 0));
        cancel_changes.setText("CANCELAR");
        cancel_changes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_changesActionPerformed(evt);
            }
        });
        EDIT_USER.add(cancel_changes, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 540, 220, 80));

        MainMenu.add(EDIT_USER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 940));

        VIEW_PROFILE.setBackground(new java.awt.Color(204, 255, 255));
        VIEW_PROFILE.setPreferredSize(new java.awt.Dimension(1920, 940));
        VIEW_PROFILE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loggedFNAME.setEnabled(false);
        VIEW_PROFILE.add(loggedFNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 360, 60));

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("EVENTOS CREADOS");
        VIEW_PROFILE.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 190, 180, 30));

        jLabel24.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Nombre de Usuario");
        VIEW_PROFILE.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        loggedUSER.setEnabled(false);
        VIEW_PROFILE.add(loggedUSER, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 360, 60));

        jLabel25.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Contraseña");
        VIEW_PROFILE.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, -1));

        loggedPW.setEnabled(false);
        VIEW_PROFILE.add(loggedPW, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 360, 60));

        auth1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        auth1.setForeground(new java.awt.Color(0, 0, 0));
        auth1.setText("Autoridad");
        VIEW_PROFILE.add(auth1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Edad");
        VIEW_PROFILE.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 200, -1, -1));

        creadosLogged.setColumns(20);
        creadosLogged.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        creadosLogged.setForeground(new java.awt.Color(0, 0, 0));
        creadosLogged.setRows(5);
        creadosLogged.setEnabled(false);
        jScrollPane3.setViewportView(creadosLogged);

        VIEW_PROFILE.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 220, 760, 260));

        jLabel27.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Nombre Completo");
        VIEW_PROFILE.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        loggedAUTH.setEnabled(false);
        VIEW_PROFILE.add(loggedAUTH, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 170, 60));

        loggedAGE.setEnabled(false);
        VIEW_PROFILE.add(loggedAGE, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 170, 60));

        MainMenu.add(VIEW_PROFILE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        REPORTS.setForeground(new java.awt.Color(0, 0, 0));
        REPORTS.setPreferredSize(new java.awt.Dimension(1920, 940));

        REPORTES_REALIZADOS.setBackground(new java.awt.Color(204, 255, 255));
        REPORTES_REALIZADOS.setPreferredSize(new java.awt.Dimension(1920, 940));
        REPORTES_REALIZADOS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        realizados_disp.setColumns(20);
        realizados_disp.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        realizados_disp.setForeground(new java.awt.Color(0, 0, 0));
        realizados_disp.setRows(5);
        realizados_disp.setEnabled(false);
        jScrollPane10.setViewportView(realizados_disp);

        REPORTES_REALIZADOS.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 910, 800));

        jLabel46.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 0));
        jLabel46.setText("EVENTOS REALIZADOS");
        REPORTES_REALIZADOS.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 420, 30));

        REPORTS.addTab("EVENTOS REALIZADOS", REPORTES_REALIZADOS);

        REPORTES_FUTUROS.setBackground(new java.awt.Color(204, 255, 255));
        REPORTES_FUTUROS.setPreferredSize(new java.awt.Dimension(1920, 940));
        REPORTES_FUTUROS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        futuros_disp.setColumns(20);
        futuros_disp.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        futuros_disp.setForeground(new java.awt.Color(0, 0, 0));
        futuros_disp.setRows(5);
        futuros_disp.setEnabled(false);
        jScrollPane9.setViewportView(futuros_disp);

        REPORTES_FUTUROS.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 910, 790));

        jLabel45.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("EVENTOS FUTUROS");
        REPORTES_FUTUROS.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 380, 30));

        REPORTS.addTab("EVENTOS FUTUROS", REPORTES_FUTUROS);

        REPORTES_CANCELADOS.setBackground(new java.awt.Color(204, 255, 255));
        REPORTES_CANCELADOS.setPreferredSize(new java.awt.Dimension(1920, 940));
        REPORTES_CANCELADOS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancelados_disp.setColumns(20);
        cancelados_disp.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        cancelados_disp.setRows(5);
        cancelados_disp.setEnabled(false);
        jScrollPane8.setViewportView(cancelados_disp);

        REPORTES_CANCELADOS.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 910, 800));

        jLabel44.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("EVENTOS CANCELADOS");
        REPORTES_CANCELADOS.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 440, 30));

        REPORTS.addTab("EVENTOS CANCELADOS", REPORTES_CANCELADOS);

        MainMenu.add(REPORTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 940));

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
        if (!usernameField.getText().isEmpty() && !passwordField.getText().isEmpty()) {
            Usuario temp = UserTK.search(usernameField.getText(), passwordField.getText());

            if (temp != null) {

                MAIN.loggeado = temp;

                JOptionPane.showMessageDialog(null, "BIENVENIDO AL SISTEMA, " + temp.getFullName());
                this.MainLogin.setVisible(false);
                this.MainMenu.setVisible(true);
                usernameField.setText("");
                passwordField.setText("");

                if (MAIN.loggeado instanceof Administrador) {
                    this.tuner.setEnabled(true);
                    if (this.tuner.getText().equals("Administracion de Eventos")) {

                        this.CrearUser.setVisible(false);
                        this.EditarUser.setVisible(false);
                        this.EliminarUser.setVisible(false);
                        this.CrearEvento.setVisible(true);
                        this.BuscarEvento.setVisible(true);
                        this.EliminarEvento.setVisible(true);

                    }
                    System.out.println("Loged " + temp.getUsername());
                } else if (MAIN.loggeado instanceof Default) {
                    this.tuner.setEnabled(true);
                    if (this.tuner.getText().equals("Administracion de Eventos")) {

                        this.CrearUser.setVisible(false);
                        this.EditarUser.setVisible(false);
                        this.EliminarUser.setVisible(false);
                        this.CrearEvento.setVisible(true);
                        this.BuscarEvento.setVisible(true);
                        this.EliminarEvento.setVisible(true);

                    }
                    System.out.println("Logged " + temp.getUsername());
                } else if (MAIN.loggeado instanceof Contenidos) {
                    this.tuner.setEnabled(false);
                    if (this.tuner.getText().equals("Administracion de Eventos")) {

                        this.CrearUser.setVisible(false);
                        this.EditarUser.setVisible(false);
                        this.EliminarUser.setVisible(false);
                        this.CrearEvento.setVisible(true);
                        this.BuscarEvento.setVisible(true);
                        this.EliminarEvento.setVisible(true);

                    }
                } else if (MAIN.loggeado instanceof Limitado) {

                    this.tuner.setEnabled(false);
                    this.CrearUser.setVisible(false);
                    this.EditarUser.setVisible(false);
                    this.EliminarUser.setVisible(false);
                    this.CrearEvento.setVisible(false);
                    this.BuscarEvento.setVisible(true);
                    this.EliminarEvento.setVisible(false);
                    this.tuner.setText("Administracion de Eventos");

                    System.out.println("Logged " + temp.getUsername());

                }

                this.savedLoggedData = MAIN.loggeado;

            } else {
                JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA INVALIDOS");
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
        this.DeleteSearch.setVisible(true);
        this.searchDelete.setVisible(true);
        if (Evento.eventos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "TODAVIA NO SE HAN CREADO EVENTOS");
        }


    }//GEN-LAST:event_EliminarEventoActionPerformed

    private void tunerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tunerActionPerformed
        switch (tuner.getText()) {
            case "Administracion de Usuarios":

                this.CrearEvento.setVisible(true);
                this.BuscarEvento.setVisible(true);
                this.EliminarEvento.setVisible(true);
                this.CrearUser.setVisible(false);
                this.EditarUser.setVisible(false);
                this.EliminarUser.setVisible(false);
                tuner.setText("Administracion de Eventos");

                break;
            case "Administracion de Eventos":

                this.CrearUser.setVisible(true);
                this.EditarUser.setVisible(true);
                this.EliminarUser.setVisible(true);
                this.CrearEvento.setVisible(false);
                this.BuscarEvento.setVisible(false);
                this.EliminarEvento.setVisible(false);
                this.tuner.setText("Administracion de Usuarios");
                this.tuner.setEnabled(true);

                break;
        }
        USER_CREATOR.setVisible(false);
        CREATOR.setVisible(false);


    }//GEN-LAST:event_tunerActionPerformed

    private void CrearUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearUserActionPerformed
        this.USER_CREATOR.setVisible(true);
        this.CrearUser.setVisible(false);
        tuner.setVisible(false);
        this.EditarUser.setVisible(false);
        this.EliminarUser.setVisible(false);


    }//GEN-LAST:event_CrearUserActionPerformed

    private void EditarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarUserActionPerformed
        this.EditarUser.setVisible(false);
        tuner.setVisible(false);
        this.CrearUser.setVisible(false);
        this.EliminarUser.setVisible(false);
        userFinder.setVisible(true);
        userFinderBUTTON.setVisible(true);


    }//GEN-LAST:event_EditarUserActionPerformed

    private void EliminarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarUserActionPerformed
        EliminarUser.setVisible(false);
        tuner.setVisible(false);
        CrearUser.setVisible(false);
        this.EditarUser.setVisible(false);

    }//GEN-LAST:event_EliminarUserActionPerformed

    private void CREATE_USERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREATE_USERActionPerformed
        if (!fname.getText().isEmpty() && !this.usuario.getText().isEmpty() && this.AgeSelector.getSelectedItem() != null && this.autoridad.getSelectedItem() != null) {
            boolean uniqueUser = true;
            for (Usuario us : MAIN.UserTK.users) {
                if (us.getUsername().equals(this.usuario.getText())) {
                    uniqueUser = false;
                    break;
                }
            }

            if (uniqueUser) {
                MAIN.UserTK.crearUsuario(fname.getText(), usuario.getText(), pw.getText(), Integer.parseInt(this.AgeSelector.getSelectedItem().toString()), autoridad);
                JOptionPane.showMessageDialog(null, "USUARIO CREADO EXITOSAMENTE");
                this.BACK2MENU.doClick();
            } else {
                JOptionPane.showMessageDialog(null, "NOMBRE DE USUARIO YA EN USO");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Llene todos los campos por favor");
        }

    }//GEN-LAST:event_CREATE_USERActionPerformed

    private void autoridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autoridadActionPerformed

    private void BOTON_CREAR_EVENTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_CREAR_EVENTOSActionPerformed

        dateSelected = DEIT.getDate();
        tipoDeporte tmp1 = getSport(this.SPORT_COMBO.getSelectedIndex());
        tipoMusica tmp2 = getMusic(this.MUSIC_COMBO.getSelectedIndex());
        try {
            switch (selection) {
                case DEPORTIVO:
                    if (!evName.getText().isBlank() && !evCode.getText().isBlank() && !desc.getText().isBlank() && !cantPeople.getText().isBlank() && !T1.getText().isBlank() && !T2.getText().isBlank() && dateSelected != null
                            && this.SPORT_COMBO.getSelectedItem() != null) {
                        if (Integer.parseInt(cantPeople.getText()) > 20000) {
                            tk.createEvent(Integer.parseInt(cantPeople.getText()), Integer.parseInt(evCode.getText()), evName.getText(), desc.getText(),
                                    Double.parseDouble(rent.getText()), tipoEvento.DEPORTIVO, tipoMusica.OTRO, tmp1, T1.getText(), T2.getText());

                            if (Evento.kiwi) {
                                clean();
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "LA CANTIDAD MAXIMA DE PERSONAS ES DE 25000");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Llene todos los campos por favor");

                    }
                    break;
                case MUSICAL:

                    if (!evName.getText().isBlank() && !evCode.getText().isBlank() && !desc.getText().isBlank() && !cantPeople.getText().isBlank() && dateSelected != null
                            && this.MUSIC_COMBO.getSelectedItem() != null) {

                        if (Integer.parseInt(cantPeople.getText()) > 25000) {
                            tk.createEvent(Integer.parseInt(cantPeople.getText()), Integer.parseInt(evCode.getText()), evName.getText(), desc.getText(),
                                    Double.parseDouble(rent.getText()), tipoEvento.MUSICAL, tmp2, tipoDeporte.TENIS, "", "");

                            if (Evento.kiwi) {
                                clean();
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "LA CANTIDAD MAXIMA DE PERSONAS ES DE 25000");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Llene todos los campos por favor");
                    }
                    break;
                case RELIGIOSO:
                    if (!evName.getText().isBlank() && !evCode.getText().isBlank() && !desc.getText().isBlank() && !cantPeople.getText().isBlank() && dateSelected != null) {
                        if (Integer.parseInt(cantPeople.getText()) > 25000) {
                            tk.createEvent(Integer.parseInt(cantPeople.getText()), Integer.parseInt(evCode.getText()), evName.getText(), desc.getText(),
                                    Double.parseDouble(rent.getText()), tipoEvento.RELIGIOSO, music, spa, "", "");

                            if (Evento.kiwi) {
                                clean();
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "LA CANTIDAD MAXIMA DE PERSONAS ES DE 30000");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Llene todos los campos por favor");
                    }
                    break;
                default:
                    break;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "EL CODIGO ES NUMERICO");
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
        t1.setVisible(false);
        t2.setVisible(false);
        T1.setVisible(false);
        T2.setVisible(false);
        CREATOR.setVisible(true);
        selection = tipoEvento.RELIGIOSO;
        this.EVENT_DISPLAY.setText("CREACION DE EVENTO RELIGIOSO");
        this.sType.setVisible(false);
        this.SPORT_COMBO.setVisible(false);
        this.MUSIC_COMBO.setVisible(false);

    }//GEN-LAST:event_RActionPerformed

    private void SPORT_COMBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPORT_COMBOActionPerformed

    }//GEN-LAST:event_SPORT_COMBOActionPerformed

    private void MUSIC_COMBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MUSIC_COMBOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MUSIC_COMBOActionPerformed

    private void BACK2MENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACK2MENUActionPerformed
        this.VIEW_PROFILE.setVisible(false);
        this.RealTime.setVisible(true);
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
        this.USER_CREATOR.setVisible(false);
        this.tuner.setVisible(true);
        this.tuner.setText("Administracion de Eventos");
        if (MAIN.loggeado instanceof Limitado) {
            System.out.println("denied");
            this.CrearEvento.setVisible(false);
            this.EliminarEvento.setVisible(false);
            this.BuscarEvento.setVisible(true);
        } else {
            this.CrearEvento.setVisible(true);
            this.EliminarEvento.setVisible(true);
            this.BuscarEvento.setVisible(true);
        }
        this.FLASH_CARDS.setVisible(false);
        this.DISPLAY_AND_EDIT.setVisible(false);

        this.searchDelete.setVisible(false);
        this.DeleteSearch.setVisible(false);
        this.USER_CREATOR.setVisible(false);
        userFinder.setVisible(false);
        userFinderBUTTON.setVisible(false);
        this.EDIT_USER.setVisible(false);
        this.REPORTS.setVisible(false);

    }//GEN-LAST:event_BACK2MENUActionPerformed

    private void search_FCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_FCActionPerformed

        JButton[] flashCards = {B00, B01, B02, B03, B10, B11, B12, B13};
        for (int i = 0; i < flashCards.length; i++) {
            flashCards[i].setVisible(false);
        }
        int codigo;
        try {
            if (!busqueda.getText().isEmpty() && Integer.parseInt(busqueda.getText()) > 0) {
                codigo = Integer.parseInt(busqueda.getText());
                Evento ev = tk.searchEvent(codigo, 0);
                savedEventData = ev;
                savedCode = codigo;
                if (ev != null) {
                    EventoDeportivo tp;
                    EventoMusical tp2;
                    EventoReligioso tp3;
                    if (MAIN.loggeado instanceof Limitado) {
                        this.EDITAR.setVisible(false);
                    }
                    switch (ev.eventoTipo) {
                        case DEPORTIVO:
                            tp = (EventoDeportivo) ev;
                            this.FLASH_CARDS.setVisible(false);
                            this.DISPLAY_AND_EDIT.setVisible(true);
                            this.SPORTS_COMBO_disp.setVisible(false);
                            this.MUSIC_COMBO_disp.setVisible(false);
                            this.Convertidos_disp.setVisible(false);
                            this.musicType_disp.setVisible(false);
                            this.musicosRegister.setVisible(false);
                            this.musics_disp.setVisible(false);
                            this.musicosRegister.setVisible(false);
                            this.instrumentosRegister.setVisible(false);
                            this.Integrantes1Register.setVisible(false);
                            this.Integrantes2Register.setVisible(false);
                            this.DEIT_disp.setVisible(false);
                            this.integrantes1_disp.setVisible(true);
                            this.integrantes2_disp.setVisible(true);
                            this.sportType_disp.setVisible(true);
                            this.DEIT_disp.setVisible(false);
                            this.sType1.setText("TIPO DE DEPORTE");
                            this.musics_disp.setVisible(true);
                            list3.setVisible(false);
                            list1.setVisible(true);
                            list2.setVisible(true);

                            tp.printEvent(codigo, this.renta_disp, this.Type_disp, this.cantPersonas_disp, this.codigo_disp, this.title_disp, this.desc_disp, this.fecha_disp,
                                    this.T1_disp, this.T2_disp, this.integrantes1_disp, this.integrantes2_disp, this.sportType_disp,
                                    this.sportType_disp, this.musics_disp, this.Convertidos_disp);
                            this.SPORTS_COMBO_disp.setSelectedItem(tp.getSport().toString());

                            break;
                        case MUSICAL:
                            tp2 = (EventoMusical) ev;

                            this.FLASH_CARDS.setVisible(false);
                            this.DISPLAY_AND_EDIT.setVisible(true);
                            this.SPORTS_COMBO_disp.setVisible(false);
                            this.MUSIC_COMBO_disp.setVisible(false);
                            this.Convertidos_disp.setVisible(false);
                            this.musicType_disp.setVisible(true);
                            this.musicosRegister.setVisible(false);
                            this.musics_disp.setVisible(true);
                            this.musicosRegister.setVisible(false);
                            this.instrumentosRegister.setVisible(false);
                            this.Integrantes1Register.setVisible(false);
                            this.Integrantes2Register.setVisible(false);
                            this.DEIT_disp.setVisible(false);
                            this.integrantes1_disp.setVisible(false);
                            this.integrantes2_disp.setVisible(false);
                            this.sportType_disp.setVisible(false);
                            this.T1_disp.setVisible(false);
                            t3.setVisible(false);
                            t4.setVisible(false);
                            this.T2_disp.setVisible(false);
                            sType1.setText("TIPO DE MUSICA");
                            this.DEIT_disp.setVisible(false);
                            list3.setVisible(true);
                            list1.setVisible(false);
                            list2.setVisible(false);

                            tp2.printEvent(codigo, this.renta_disp, this.Type_disp, this.cantPersonas_disp, this.codigo_disp, this.title_disp, this.desc_disp, this.fecha_disp,
                                    this.T1_disp, this.T2_disp, this.integrantes1_disp, this.integrantes2_disp, this.musicType_disp,
                                    this.sportType_disp, this.musics_disp, this.Convertidos_disp);
                            this.MUSIC_COMBO_disp.setSelectedItem(tp2.getMusicType().toString());

                            break;
                        case RELIGIOSO:
                            tp3 = (EventoReligioso) ev;

                            this.FLASH_CARDS.setVisible(false);
                            this.DISPLAY_AND_EDIT.setVisible(true);
                            this.SPORTS_COMBO_disp.setVisible(false);
                            this.MUSIC_COMBO_disp.setVisible(false);
                            this.Convertidos_disp.setVisible(true);
                            this.musicType_disp.setVisible(false);
                            this.musicosRegister.setVisible(false);
                            this.musics_disp.setVisible(false);
                            this.musicosRegister.setVisible(false);
                            this.instrumentosRegister.setVisible(false);
                            this.Integrantes1Register.setVisible(false);
                            this.Integrantes2Register.setVisible(false);
                            this.DEIT_disp.setVisible(false);
                            this.integrantes1_disp.setVisible(false);
                            this.integrantes2_disp.setVisible(false);
                            this.sportType_disp.setVisible(false);
                            this.musicType_disp.setVisible(false);
                            this.sType1.setText("CANTIDAD DE PERSONAS CONVERTIDAS");
                            Convertidos_disp.setVisible(true);
                            this.T1_disp.setVisible(false);
                            this.T2_disp.setVisible(false);
                            t3.setVisible(false);
                            t4.setVisible(false);
                            this.Convertidos_disp.setVisible(false);
                            this.INTS1.setVisible(false);
                            this.INTS2.setVisible(false);
                            list3.setVisible(false);
                            list1.setVisible(false);
                            list2.setVisible(false);

                            tp3.printEvent(codigo, this.renta_disp, this.Type_disp, this.cantPersonas_disp, this.codigo_disp, this.title_disp, this.desc_disp, this.fecha_disp,
                                    this.T1_disp, this.T2_disp, this.integrantes1_disp, this.integrantes2_disp, this.sportType_disp,
                                    this.sportType_disp, this.musics_disp, this.Convertidos_disp);

                            break;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "NO SE HA ENCONTRADO UN EVENTO CON ESTE CODIGO");
                }

            } else {
                JOptionPane.showMessageDialog(null, "INGRESE UN CODIGO VALIDO");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "INGRESE NUMEROS SOLAMENTE");
        } catch (NullPointerException e) {

        }

    }//GEN-LAST:event_search_FCActionPerformed

    private void BuscarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarEventoActionPerformed
        FLASH_CARDS.setVisible(true);
        this.tuner.setVisible(false);
        this.BuscarEvento.setVisible(false);
        this.CrearEvento.setVisible(false);
        this.EliminarEvento.setVisible(false);
        this.setCards(musical, deportivo, religioso);


    }//GEN-LAST:event_BuscarEventoActionPerformed

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busquedaActionPerformed

    private void CANCEL_EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCEL_EDITActionPerformed

        prov1.clear();
        prov2.clear();

        this.canceled(savedEventData);
        this.fecha_disp.setVisible(true);
        this.EDITAR.setVisible(true);
        this.CANCEL_EDIT.setVisible(false);
        this.SAVE_EDIT.setVisible(false);
        this.addP1.setVisible(false);
        this.addP2.setVisible(false);


    }//GEN-LAST:event_CANCEL_EDITActionPerformed

    private void SPORTS_COMBO_dispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPORTS_COMBO_dispActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SPORTS_COMBO_dispActionPerformed

    private void MUSIC_COMBO_dispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MUSIC_COMBO_dispActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MUSIC_COMBO_dispActionPerformed

    private void EDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITARActionPerformed

        editable = true;

        this.cantPersonas_disp.setEditable(true);
        this.renta_disp.setEditable(true);
        this.codigo_disp.setEditable(true);
        this.title_disp.setEditable(true);
        desc.setEditable(true);
        this.fecha_disp.setVisible(false);
        this.DEIT_disp.setVisible(true);
        this.DEIT_disp.setDate(savedEventData.getFechaRealizacion().getTime());

        this.SAVE_EDIT.setVisible(true);
        this.EDITAR.setVisible(false);
        this.CANCEL_EDIT.setVisible(true);

        this.integrantes1_disp.setVisible(false);
        this.integrantes2_disp.setVisible(false);
        this.list1.setVisible(false);
        this.list2.setVisible(false);
        list3.setVisible(false);

        if (savedEventData.eventoTipo.equals(DEPORTIVO)) {
            EventoDeportivo temp = (EventoDeportivo) savedEventData;
            this.MUSIC_COMBO_disp.setVisible(false);
            this.SPORTS_COMBO_disp.setVisible(true);
            this.list1.setVisible(false);
            this.list2.setVisible(false);
            list3.setVisible(false);
            this.addMusician.setVisible(false);
            this.musicosRegister.setVisible(false);
            this.addP1.setVisible(true);
            this.addP2.setVisible(true);
            this.integrantes1_disp.setVisible(false);
            this.integrantes2_disp.setVisible(false);
            this.Integrantes1Register.setVisible(true);
            this.Integrantes2Register.setVisible(true);

        } else if (savedEventData.eventoTipo.equals(MUSICAL)) {
            EventoMusical temp = (EventoMusical) savedEventData;

            this.addMusician.setVisible(true);
            this.musicosRegister.setVisible(true);
            this.instrumentosRegister.setVisible(true);
            this.musics_disp.setVisible(false);
            this.musicosRegister.setVisible(true);
            this.Integrantes1Register.setVisible(false);
            this.Integrantes2Register.setVisible(false);
            this.addP1.setVisible(false);
            this.addP2.setVisible(false);
            this.MUSIC_COMBO_disp.setVisible(true);

            this.SPORTS_COMBO_disp.setVisible(false);
        }


    }//GEN-LAST:event_EDITARActionPerformed

    private void SAVE_EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVE_EDITActionPerformed
        try {

            for (String a : prov1) {
                p1.add(a);
            }
            for (String a : prov2) {
                p2.add(a);
            }

            if (savedEventData.eventoTipo.equals(DEPORTIVO)) {
                if ((p1.isEmpty() || p2.isEmpty()) || (prov1.isEmpty() || prov2.isEmpty())) {
                    JOptionPane.showMessageDialog(null, "ASEGURESE DE LLENAR LOS DATOS ADICIONALES");
                    return;
                }
            }

            tk.editEvent(this.savedCode, this.cantPersonas_disp, this.codigo_disp, this.title_disp, this.desc_disp, this.DEIT_disp, this.fecha_disp, this.T1_disp, this.T2_disp,
                    this.renta_disp, this.p1, this.p2, this.Integrantes1Register, this.Integrantes2Register, this.musicType_disp, this.MUSIC_COMBO_disp, this.musicosRegister,
                    this.instrumentosRegister, this.sportType_disp, this.SPORTS_COMBO_disp, this.m, this.Convertidos_disp, this.INTS1, this.INTS2, editable);

            this.addMusician.setVisible(false);
            this.addP1.setVisible(false);
            this.addP2.setVisible(false);
            this.addMusician.setVisible(false);
            this.MUSIC_COMBO_disp.setVisible(false);
            this.SPORTS_COMBO_disp.setVisible(false);
            this.EDITAR.setVisible(true);
            this.SAVE_EDIT.setVisible(false);
            this.CANCEL_EDIT.setVisible(false);
            this.BACK2MENU.doClick();
            prov1.clear();
            prov2.clear();

        } catch (HeadlessException e) {

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "EL CODIGO ES NUMERICO");
        }


    }//GEN-LAST:event_SAVE_EDITActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        this.MainMenu.setVisible(false);
        this.MainLogin.setVisible(true);
        this.BACK2MENU.doClick();
        this.tuner.setText("Administracion de Eventos");
        this.creadosLogged.setText("NO DISPONIBLE");
    }//GEN-LAST:event_EXITActionPerformed

    private void musicosRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicosRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_musicosRegisterActionPerformed

    private void Integrantes1RegisterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Integrantes1RegisterKeyPressed


    }//GEN-LAST:event_Integrantes1RegisterKeyPressed

    private void instrumentosRegisterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_instrumentosRegisterKeyPressed

    }//GEN-LAST:event_instrumentosRegisterKeyPressed

    private void addP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addP1ActionPerformed

        if (!this.Integrantes1Register.getText().isEmpty()) {
            prov1.add(this.Integrantes1Register.getText());

        } else {
            JOptionPane.showMessageDialog(null, "Campo de jugador vacio");
        }
    }//GEN-LAST:event_addP1ActionPerformed

    private void addP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addP2ActionPerformed
        if (!this.Integrantes2Register.getText().isEmpty()) {
            prov2.add(this.Integrantes2Register.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Campo de jugador vacio");
        }
    }//GEN-LAST:event_addP2ActionPerformed

    private void addMusicianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMusicianActionPerformed
        if (!this.musicosRegister.getText().isEmpty() || !this.instrumentosRegister.getText().isEmpty()) {
            String musician, instrument;
            musician = this.musicosRegister.getText();
            instrument = this.instrumentosRegister.getText();

            m.add("Nombre: " + musician + " - Instrumento: " + instrument);

        } else {
            JOptionPane.showMessageDialog(null, "Campo de Musico o instrumento vacio");
        }
    }//GEN-LAST:event_addMusicianActionPerformed

    private void DeleteSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteSearchActionPerformed

    private void searchDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDeleteActionPerformed

        boolean confirmed = false;

        if (!this.DeleteSearch.getText().isEmpty() && Integer.parseInt(this.DeleteSearch.getText()) > 0) {
            Evento temp = tk.searchEvent(Integer.parseInt(this.DeleteSearch.getText()), 0);
            if (MAIN.loggeado instanceof Administrador) {
                Administrador tp = (Administrador) MAIN.loggeado;
                if (tp.eventosCreados.contains(temp)) {
                    confirmed = true;
                }
            } else if (MAIN.loggeado instanceof Default) {
                Default tp = (Default) MAIN.loggeado;
                if (tp.eventosCreados.contains(temp)) {
                    confirmed = true;
                }
            } else if (MAIN.loggeado instanceof Contenidos) {
                Contenidos tp = (Contenidos) MAIN.loggeado;
                if (tp.eventosCreados.contains(temp)) {
                    confirmed = true;
                }
            }

            if (confirmed != false) {
                if (temp.realizado != true) {
                    if (temp != null) {
                        Object[] eleccion = {"ELIMINAR", "CANCELAR"};
                        int opc = JOptionPane.showOptionDialog(null, "SE BORRARA UN EVENTO \n¿DESEA CONTINUAR?", "ELMINAR UN EVENTO",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, eleccion, eleccion[0]);

                        switch (opc) {
                            case JOptionPane.YES_OPTION:
                                Evento canceledEvent = temp;
                                canceledEvent.setCancelado(true);

                                Evento.eventos.add(canceledEvent);
                                JOptionPane.showMessageDialog(null, "SE HA REMOVIDO EL EVENTO TITULADO COMO: \n" + temp.getTitulo().toUpperCase());
                                this.BACK2MENU.doClick();
                                break;
                            case JOptionPane.CANCEL_OPTION:
                                this.BACK2MENU.doClick();
                                break;
                            default:
                                this.BACK2MENU.doClick();
                                break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "NO SE HA ENCONTRADO EL EVENTO");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "ESTE EVENTO YA HA SIDO REALIZADO");
                }
            } else {
                JOptionPane.showMessageDialog(null, "ESTE EVENTO SOLO PUEDE SER ELIMINADO POR SU CREADOR");
            }
        } else {
            JOptionPane.showMessageDialog(null, "EL EVENTO NO EXISTE O EL CODIGO ES INVALIDO");
        }

    }//GEN-LAST:event_searchDeleteActionPerformed

    private void user_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_editActionPerformed
        this.save_changes.setVisible(true);
        this.cancel_changes.setVisible(true);
        this.user_edit.setVisible(false);
        this.fname_disp.setEnabled(true);
        this.usuario_disp.setEnabled(true);
        this.pw_disp.setEnabled(true);
        this.autoridad_disp.setVisible(false);
        this.AgeSelector_disp.setEnabled(true);
        this.AgeSelector_disp.setSelectedItem(savedUserData.getAge() + "");
        auth.setVisible(false);


    }//GEN-LAST:event_user_editActionPerformed

    private void autoridad_dispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoridad_dispActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autoridad_dispActionPerformed

    private void userFinderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFinderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userFinderActionPerformed

    private void userFinderBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFinderBUTTONActionPerformed

        this.printUserData();


    }//GEN-LAST:event_userFinderBUTTONActionPerformed

    private void save_changesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_changesActionPerformed
        if (!this.usuario_disp.getText().isEmpty() && !this.fname_disp.getText().isEmpty() && !this.pw_disp.getText().isEmpty() && this.AgeSelector_disp.getSelectedItem() != null) {
            this.savedUserData.setUsername(this.usuario_disp.getText());
            this.savedUserData.setFullName(this.fname_disp.getText());
            this.savedUserData.setPassword(this.pw_disp.getText());
            this.savedUserData.setAge(Integer.parseInt(this.AgeSelector_disp.getSelectedItem().toString()));
            this.save_changes.setVisible(false);
            this.cancel_changes.setVisible(false);
            this.user_edit.setVisible(true);
            this.fname_disp.setEnabled(true);
            this.usuario_disp.setEnabled(true);
            this.pw_disp.setEnabled(true);

            this.AgeSelector_disp.setEnabled(true);
            if (savedUserData.getUsername().equals(MAIN.loggeado.getUsername())) {
                this.savedLoggedData = MAIN.loggeado;
            }
            JOptionPane.showMessageDialog(null, "CAMBIOS GUARDADOS EXITOSAMENTE");
            this.BACK2MENU.doClick();
        } else {
            JOptionPane.showMessageDialog(null, "LLENE LOS CAMPOS VACIOS");
        }


    }//GEN-LAST:event_save_changesActionPerformed

    private void cancel_changesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_changesActionPerformed
        this.printUserData();
        this.user_edit.setVisible(true);
        this.save_changes.setVisible(false);
        this.cancel_changes.setVisible(false);
        this.fname_disp.setEnabled(false);
        this.pw_disp.setEnabled(false);
        this.usuario_disp.setEnabled(false);
        this.AgeSelector_disp.setEnabled(false);
        this.autoridad_disp.setVisible(true);
        this.autoridad_disp.setEnabled(false);
    }//GEN-LAST:event_cancel_changesActionPerformed

    private void VER_PERFILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VER_PERFILActionPerformed
        this.VIEW_PROFILE.setVisible(true);
        this.FLASH_CARDS.setVisible(false);
        this.DISPLAY_AND_EDIT.setVisible(false);
        this.BuscarEvento.setVisible(false);
        this.EliminarEvento.setVisible(false);
        this.CrearEvento.setVisible(false);
        this.searchDelete.setVisible(false);
        this.DeleteSearch.setVisible(false);
        this.USER_CREATOR.setVisible(false);
        userFinder.setVisible(false);
        userFinderBUTTON.setVisible(false);
        this.EDIT_USER.setVisible(false);
        R.setVisible(false);
        M.setVisible(false);
        this.CREATOR.setVisible(false);
        this.BAR.setVisible(true);
        this.tuner.setVisible(false);
        CrearUser.setVisible(false);
        EditarUser.setVisible(false);
        EliminarUser.setVisible(false);

        this.loggedFNAME.setText(this.savedLoggedData.getFullName());
        this.loggedUSER.setText(this.savedLoggedData.getUsername());
        this.loggedPW.setText(this.savedLoggedData.getPassword());
        this.loggedAGE.setText(this.savedLoggedData.getAge() + "");

        this.creadosLogged.setText(UserTK.printLoggedEvents(this.loggedAUTH));


    }//GEN-LAST:event_VER_PERFILActionPerformed


    private void reports_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reports_BUTTONActionPerformed
        this.REPORTS.setVisible(true);
        this.VIEW_PROFILE.setVisible(false);
        this.FLASH_CARDS.setVisible(false);
        this.DISPLAY_AND_EDIT.setVisible(false);
        this.BuscarEvento.setVisible(false);
        this.EliminarEvento.setVisible(false);
        this.CrearEvento.setVisible(false);
        this.searchDelete.setVisible(false);
        this.DeleteSearch.setVisible(false);
        this.USER_CREATOR.setVisible(false);
        userFinder.setVisible(false);
        userFinderBUTTON.setVisible(false);
        this.EDIT_USER.setVisible(false);
        R.setVisible(false);
        M.setVisible(false);
        this.CREATOR.setVisible(false);
        this.BAR.setVisible(true);
        this.tuner.setVisible(false);
        CrearUser.setVisible(false);
        EditarUser.setVisible(false);
        EliminarUser.setVisible(false);
        this.RealTime.setVisible(false);

        if (!Evento.eventos.isEmpty()) {
            this.sortEvents();

            if (!realizados.isEmpty()) {
                for (int i = 0; i < MAIN.realizados.size(); i++) {
                    for (int j = i + 1; j < MAIN.realizados.size(); j++) {
                        if (MAIN.realizados.get(j).getFechaRealizacion().getTimeInMillis() > MAIN.realizados.get(i).getFechaRealizacion().getTimeInMillis()) {
                            Evento Aporal;

                            Evento Bporal;

                            Aporal = MAIN.realizados.get(i);

                            Bporal = MAIN.realizados.get(j);
                            MAIN.realizados.set(i, Bporal);
                            MAIN.realizados.set(j, Aporal);

                        }
                    }
                }
                this.realizados_disp.setText(this.tk.printRealizados());
                MAIN.realizados.clear();
            } else {
                this.realizados_disp.setText("NO DISPONIBLE");
            }

            if (!futuros.isEmpty()) {
                this.futuros_disp.setText(this.tk.printFuturos());
                MAIN.futuros.clear();
            } else {
                this.futuros_disp.setText("NO DISPONIBLE");
            }

            if (!cancelados.isEmpty()) {
                this.cancelados_disp.setText(this.tk.printCancelados());
                MAIN.cancelados.clear();
            } else {
                this.cancelados_disp.setText("NO DISPONIBLE");
            }

        } else {
            this.realizados_disp.setText("NO DISPONIBLE");
            this.cancelados_disp.setText("NO DISPONIBLE");
            this.futuros_disp.setText("NO DISPONIBLE");
        }

    }//GEN-LAST:event_reports_BUTTONActionPerformed

    private void cantPeopleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantPeopleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantPeopleActionPerformed

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

    public void canceled(Evento event) {

        EventoDeportivo tp;
        EventoMusical tp2;
        EventoReligioso tp3;

        switch (event.eventoTipo) {
            case DEPORTIVO:
                tp = (EventoDeportivo) event;
                this.SPORTS_COMBO_disp.setVisible(false);
                this.MUSIC_COMBO_disp.setVisible(false);
                this.Convertidos_disp.setVisible(false);
                this.musicType_disp.setVisible(false);
                this.musicosRegister.setVisible(false);
                this.musics_disp.setVisible(false);
                this.musicosRegister.setVisible(false);
                this.instrumentosRegister.setVisible(false);
                this.Integrantes1Register.setVisible(false);
                this.Integrantes2Register.setVisible(false);
                this.DEIT_disp.setVisible(false);
                this.integrantes1_disp.setVisible(true);
                this.integrantes2_disp.setVisible(true);
                this.sportType_disp.setVisible(true);
                list3.setVisible(false);
                list1.setVisible(true);
                list2.setVisible(true);

                tp.printEvent(savedCode, this.renta_disp, this.Type_disp, this.cantPersonas_disp, this.codigo_disp, this.title_disp, this.desc_disp, this.fecha_disp,
                        this.T1_disp, this.T2_disp, this.integrantes1_disp, this.integrantes2_disp, this.sportType_disp,
                        this.sportType_disp, this.musics_disp, this.Convertidos_disp);

                break;
            case MUSICAL:
                tp2 = (EventoMusical) event;

                this.SPORTS_COMBO_disp.setVisible(false);
                this.MUSIC_COMBO_disp.setVisible(false);
                this.Convertidos_disp.setVisible(false);
                this.musicType_disp.setVisible(true);
                this.musicosRegister.setVisible(false);
                this.musics_disp.setVisible(true);
                this.musicosRegister.setVisible(false);
                this.instrumentosRegister.setVisible(false);
                this.Integrantes1Register.setVisible(false);
                this.Integrantes2Register.setVisible(false);
                this.DEIT_disp.setVisible(false);
                this.integrantes1_disp.setVisible(false);
                this.integrantes2_disp.setVisible(false);
                this.sportType_disp.setVisible(false);
                list3.setVisible(true);
                list1.setVisible(false);
                list2.setVisible(false);

                tp2.printEvent(savedCode, this.renta_disp, this.Type_disp, this.cantPersonas_disp, this.codigo_disp, this.title_disp, this.desc_disp, this.fecha_disp,
                        this.T1_disp, this.T2_disp, this.integrantes1_disp, this.integrantes2_disp, this.sportType_disp,
                        this.sportType_disp, this.musics_disp, this.Convertidos_disp);

                break;
            case RELIGIOSO:
                tp3 = (EventoReligioso) event;

                this.SPORTS_COMBO_disp.setVisible(false);
                this.MUSIC_COMBO_disp.setVisible(false);
                this.Convertidos_disp.setVisible(true);
                this.musicType_disp.setVisible(false);
                this.musicosRegister.setVisible(false);
                this.musics_disp.setVisible(false);
                this.musicosRegister.setVisible(false);
                this.instrumentosRegister.setVisible(false);
                this.Integrantes1Register.setVisible(false);
                this.Integrantes2Register.setVisible(false);
                this.DEIT_disp.setVisible(false);
                this.integrantes1_disp.setVisible(false);
                this.integrantes2_disp.setVisible(false);
                this.sportType_disp.setVisible(false);

                tp3.printEvent(savedCode, this.renta_disp, this.Type_disp, this.cantPersonas_disp, this.codigo_disp, this.title_disp, this.desc_disp, this.fecha_disp,
                        this.T1_disp, this.T2_disp, this.integrantes1_disp, this.integrantes2_disp, this.sportType_disp,
                        this.sportType_disp, this.musics_disp, this.Convertidos_disp);

                break;
        }
    }

    public void printUserData() {
        if (!this.userFinder.getText().isEmpty()) {
            Usuario temp;
            for (Usuario us : MAIN.UserTK.users) {
                if (us.getUsername().equals(userFinder.getText()) && !us.getUsername().equals("admin")) {

                    temp = us;
                    this.savedUserData = temp;

                    this.EDIT_USER.setVisible(false);
                    this.fname_disp.setText(savedUserData.getFullName());
                    this.pw_disp.setText(savedUserData.getPassword());
                    this.usuario_disp.setText(savedUserData.getUsername());
                    this.AgeSelector_disp.setSelectedItem(savedUserData.getAge() + "");

                    if (savedUserData instanceof Administrador) {
                        this.autoridad_disp.setSelectedItem("Administrador");
                    } else if (savedUserData instanceof Default) {
                        this.autoridad_disp.setSelectedItem("Administrador");
                    } else if (savedUserData instanceof Contenidos) {
                        this.autoridad_disp.setSelectedItem("Contenidos");
                    } else if (savedUserData instanceof Limitado) {
                        this.autoridad_disp.setSelectedItem("Limitado");
                    }

                    this.EDIT_USER.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "USUARIO NO ENCONTRADO");
                    return;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "INGRESE UN NOMBRE DE USUARIO VALIDO");
        }
    }

    public void sortEvents() {
        Evento temp;
        //realizados
        for (Evento ev : Evento.eventos) {
            if (ev.cancelado != true && ev.realizado == true) {

                MAIN.realizados.add(ev);
            }
        }

        //futuros
        for (Evento ev : Evento.eventos) {
            if (ev.cancelado != true && ev.realizado != true) {
                MAIN.futuros.add(ev);
            }
        }

        //cancelados
        for (Evento ev : Evento.eventos) {
            if (ev.cancelado == true) {
                MAIN.cancelados.add(ev);
            }
        }

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
            java.util.logging.Logger.getLogger(MAIN.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAIN().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AgeSelector;
    private javax.swing.JComboBox<String> AgeSelector_disp;
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
    private javax.swing.JToggleButton CREATE_USER;
    private javax.swing.JPanel CREATOR;
    private javax.swing.JTextField Convertidos_disp;
    private javax.swing.JButton CrearEvento;
    private javax.swing.JButton CrearUser;
    private javax.swing.JButton D;
    private com.toedter.calendar.JDateChooser DEIT;
    private com.toedter.calendar.JDateChooser DEIT_disp;
    private javax.swing.JPanel DISPLAY_AND_EDIT;
    private javax.swing.JTextField DeleteSearch;
    private javax.swing.JToggleButton EDITAR;
    private javax.swing.JPanel EDIT_USER;
    private javax.swing.JLabel EVENT_DISPLAY;
    private javax.swing.JButton EXIT;
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
    private javax.swing.JPanel REPORTES_CANCELADOS;
    private javax.swing.JPanel REPORTES_FUTUROS;
    private javax.swing.JPanel REPORTES_REALIZADOS;
    private javax.swing.JTabbedPane REPORTS;
    private javax.swing.JLabel RealTime;
    private javax.swing.JToggleButton SAVE_EDIT;
    private javax.swing.JComboBox<String> SPORTS_COMBO_disp;
    private javax.swing.JComboBox<String> SPORT_COMBO;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T1_disp;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T2_disp;
    private javax.swing.JLabel Type_disp;
    private javax.swing.JPanel USER_CREATOR;
    private javax.swing.JButton VER_PERFIL;
    private javax.swing.JPanel VIEW_PROFILE;
    private javax.swing.JButton addMusician;
    private javax.swing.JButton addP1;
    private javax.swing.JButton addP2;
    private javax.swing.JLabel auth;
    private javax.swing.JLabel auth1;
    private javax.swing.JComboBox<String> autoridad;
    private javax.swing.JComboBox<String> autoridad_disp;
    private javax.swing.JTextField busqueda;
    private javax.swing.JToggleButton cancel_changes;
    private javax.swing.JTextArea cancelados_disp;
    private javax.swing.JTextField cantPeople;
    private javax.swing.JTextField cantPersonas_disp;
    private javax.swing.JTextField codigo_disp;
    private javax.swing.JTextArea creadosLogged;
    private javax.swing.JTextArea desc;
    private javax.swing.JTextArea desc_disp;
    private javax.swing.JTextField evCode;
    private javax.swing.JTextField evName;
    private javax.swing.JLabel fecha_disp;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fname_disp;
    private javax.swing.JTextArea futuros_disp;
    private javax.swing.JTextField instrumentosRegister;
    private javax.swing.JList<String> integrantes1_disp;
    private javax.swing.JList<String> integrantes2_disp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JScrollPane list1;
    private javax.swing.JScrollPane list2;
    private javax.swing.JScrollPane list3;
    private javax.swing.JTextField loggedAGE;
    private javax.swing.JTextField loggedAUTH;
    private javax.swing.JTextField loggedFNAME;
    private javax.swing.JTextField loggedPW;
    private javax.swing.JTextField loggedUSER;
    private javax.swing.JLabel musicType_disp;
    private javax.swing.JTextField musicosRegister;
    private javax.swing.JList<String> musics_disp;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField pw;
    private javax.swing.JTextField pw_disp;
    private javax.swing.JTextArea realizados_disp;
    private javax.swing.JTextField rent;
    private javax.swing.JTextField rent2;
    private javax.swing.JTextField renta_disp;
    private javax.swing.JButton reports_BUTTON;
    private javax.swing.JLabel sType;
    private javax.swing.JLabel sType1;
    private javax.swing.JToggleButton save_changes;
    private javax.swing.JButton searchDelete;
    private javax.swing.JButton search_FC;
    private javax.swing.JLabel sportType_disp;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    private javax.swing.JTextField title_disp;
    private javax.swing.JButton tuner;
    private javax.swing.JTextField userFinder;
    private javax.swing.JButton userFinderBUTTON;
    private javax.swing.JToggleButton user_edit;
    private javax.swing.JTextField usernameField;
    private javax.swing.JTextField usuario;
    private javax.swing.JTextField usuario_disp;
    // End of variables declaration//GEN-END:variables
}
