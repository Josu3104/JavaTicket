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
import Usuarios.UsuarioDefault;
import com.toedter.calendar.JTextFieldDateEditor;
import java.text.SimpleDateFormat;
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
    private ImageIcon musical;
    private ImageIcon deportivo;
    private ImageIcon religioso;

    public Sistema() throws NullPointerException {

        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        fechaNeitor = new SimpleDateFormat("dd/MM/yyyy");
        FECHA = Calendar.getInstance();
        this.RealTime.setText(fechaNeitor.format(FECHA.getTime()));
        tk = new Evento(0, 0, "", "", 0.0);
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
        eventChooser.setVisible(false);
        verEVENTO.setVisible(false);
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

    public void TUNER(JButton crearEv, JButton editEv, JButton elimEv, JButton verEv, JButton crearUs, JButton editUs, JButton elimUs, JButton tune) {
        JButton[] eventos = {crearEv, editEv, elimEv, verEv};
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
        java.awt.GridBagConstraints gridBagConstraints;

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
        verEVENTO = new javax.swing.JPanel();
        TITLE = new javax.swing.JLabel();
        TITLE1 = new javax.swing.JLabel();
        cantidad_personas = new javax.swing.JLabel();
        tipo_evento = new javax.swing.JLabel();
        codigo_evento = new javax.swing.JLabel();
        TITLE5 = new javax.swing.JLabel();
        titulo_evento = new javax.swing.JLabel();
        TITLE7 = new javax.swing.JLabel();
        TITLE8 = new javax.swing.JLabel();
        descripcion_evento = new javax.swing.JLabel();
        TITLE9 = new javax.swing.JLabel();
        fecha_evento = new javax.swing.JLabel();
        team1Label = new javax.swing.JLabel();
        equipo1_evento = new javax.swing.JLabel();
        team2Label = new javax.swing.JLabel();
        equipo2_evento = new javax.swing.JLabel();
        musicsLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        teamList2_evento = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        musicosYcargo_evento = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        teamList1_evento2 = new javax.swing.JList<>();
        sportTypeLabel = new javax.swing.JLabel();
        tipoDeporte_evento = new javax.swing.JLabel();
        musicTypeLabel = new javax.swing.JLabel();
        tipoMusica_evento = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        buscar_evento = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        convertedPeopleLabel = new javax.swing.JLabel();
        convertidos_evento = new javax.swing.JLabel();
        eventChooser = new javax.swing.JPanel();
        MainLogin = new javax.swing.JPanel();
        LoginBtn = new javax.swing.JButton();
        passwordField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        MainMenu = new javax.swing.JPanel();
        RealTime = new javax.swing.JLabel();
        BAR = new javax.swing.JPanel();
        BACK2MENU = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        CrearUser = new javax.swing.JButton();
        EditarUser = new javax.swing.JButton();
        EliminarUser = new javax.swing.JButton();
        CrearEvento = new javax.swing.JButton();
        EliminarEvento = new javax.swing.JButton();
        EditarEvento = new javax.swing.JButton();
        VerEvento = new javax.swing.JButton();
        tuner = new javax.swing.JButton();
        R = new javax.swing.JButton();
        D = new javax.swing.JButton();
        M = new javax.swing.JButton();
        FLASH_CARDS = new javax.swing.JPanel();
        EVENT_DISPLAY1 = new javax.swing.JLabel();
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
        CREATOR = new javax.swing.JPanel();
        crearDeportivo = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        evName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        evCode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rent = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
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
        cantPeople1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

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

        verEVENTO.setBackground(new java.awt.Color(0, 51, 51));
        verEVENTO.setPreferredSize(new java.awt.Dimension(980, 590));
        verEVENTO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TITLE.setText("TIPO DE EVENTO");
        verEVENTO.add(TITLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 31, 99, 28));

        TITLE1.setText("CANTIDAD DE PERSONAS");
        verEVENTO.add(TITLE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 85, -1, 28));

        cantidad_personas.setText("TIPO DE EVENTO");
        verEVENTO.add(cantidad_personas, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 85, 99, 28));

        tipo_evento.setText("TIPO DE EVENTO");
        verEVENTO.add(tipo_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 31, 99, 28));

        codigo_evento.setText("TIPO DE EVENTO");
        verEVENTO.add(codigo_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 141, 99, 28));

        TITLE5.setText("TITULO");
        verEVENTO.add(TITLE5, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 213, 99, 28));

        titulo_evento.setText("TIPO DE EVENTO");
        verEVENTO.add(titulo_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 213, 99, 28));

        TITLE7.setText("CODIGO");
        verEVENTO.add(TITLE7, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 141, -1, 28));

        TITLE8.setText("DESCRIPCION");
        verEVENTO.add(TITLE8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 271, 99, 28));

        descripcion_evento.setText("TIPO DE EVENTO");
        verEVENTO.add(descripcion_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 271, 99, 28));

        TITLE9.setText("FECHA");
        verEVENTO.add(TITLE9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 317, 99, 28));

        fecha_evento.setText("TIPO DE EVENTO");
        verEVENTO.add(fecha_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 317, 99, 28));

        team1Label.setText("Equipo 1");
        verEVENTO.add(team1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 351, 99, 28));

        equipo1_evento.setText("TIPO DE EVENTO");
        verEVENTO.add(equipo1_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 351, 99, 28));

        team2Label.setText("Equipo 2");
        verEVENTO.add(team2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 397, 99, 28));

        equipo2_evento.setText("TIPO DE EVENTO");
        verEVENTO.add(equipo2_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 397, 99, 28));

        musicsLabel.setText("Musicos");
        verEVENTO.add(musicsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 466, 99, 28));

        teamList2_evento.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(teamList2_evento);

        verEVENTO.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 363, 203, 62));

        musicosYcargo_evento.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(musicosYcargo_evento);

        verEVENTO.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 443, 203, 62));

        teamList1_evento2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(teamList1_evento2);

        verEVENTO.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 363, 203, 62));

        sportTypeLabel.setText("TIPO DE DEPORTE\\");
            verEVENTO.add(sportTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 31, -1, 28));

            tipoDeporte_evento.setText("TIPO DE EVENTO");
            verEVENTO.add(tipoDeporte_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 31, 99, 28));

            musicTypeLabel.setText("TIPO DE MUSICA");
            verEVENTO.add(musicTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 85, 99, 28));

            tipoMusica_evento.setText("TIPO DE EVENTO");
            verEVENTO.add(tipoMusica_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 85, 99, 28));

            jLabel14.setText("BUSCAR EVENTO");
            verEVENTO.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 37, -1, -1));
            verEVENTO.add(buscar_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 32, 100, -1));

            search.setText("search");
            search.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    searchActionPerformed(evt);
                }
            });
            verEVENTO.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 32, -1, -1));

            convertedPeopleLabel.setText("PERSONAS CONVERTIDAS");
            verEVENTO.add(convertedPeopleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 177, 142, 28));

            convertidos_evento.setText("TIPO DE EVENTO");
            verEVENTO.add(convertidos_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 177, 99, 28));

            eventChooser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

            jButton3.setText("jButton1");
            jButton3.setPreferredSize(new java.awt.Dimension(120, 120));
            BAR.add(jButton3, new java.awt.GridBagConstraints());

            MainMenu.add(BAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 938, 1920, 120));

            CrearUser.setText("Crear Usuario");
            CrearUser.setPreferredSize(new java.awt.Dimension(407, 460));
            CrearUser.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    CrearUserActionPerformed(evt);
                }
            });
            MainMenu.add(CrearUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

            EditarUser.setText("Editar Usuario");
            EditarUser.setPreferredSize(new java.awt.Dimension(407, 460));
            EditarUser.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    EditarUserActionPerformed(evt);
                }
            });
            MainMenu.add(EditarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, -1, -1));

            EliminarUser.setText("Eliminar Usuario");
            EliminarUser.setPreferredSize(new java.awt.Dimension(407, 460));
            EliminarUser.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    EliminarUserActionPerformed(evt);
                }
            });
            MainMenu.add(EliminarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 260, -1, -1));

            CrearEvento.setText("Crear Evento");
            CrearEvento.setPreferredSize(new java.awt.Dimension(407, 460));
            CrearEvento.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    CrearEventoActionPerformed(evt);
                }
            });
            MainMenu.add(CrearEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

            EliminarEvento.setText("Eliminar Evento");
            EliminarEvento.setPreferredSize(new java.awt.Dimension(407, 460));
            EliminarEvento.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    EliminarEventoActionPerformed(evt);
                }
            });
            MainMenu.add(EliminarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

            EditarEvento.setText("Editar Evento");
            EditarEvento.setPreferredSize(new java.awt.Dimension(407, 460));
            EditarEvento.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    EditarEventoActionPerformed(evt);
                }
            });
            MainMenu.add(EditarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 260, -1, -1));

            VerEvento.setText("Ver Evento");
            VerEvento.setPreferredSize(new java.awt.Dimension(407, 460));
            VerEvento.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    VerEventoMousePressed(evt);
                }
            });
            VerEvento.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    VerEventoActionPerformed(evt);
                }
            });
            MainMenu.add(VerEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 260, -1, -1));

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

            FLASH_CARDS.setBackground(new java.awt.Color(0, 0, 51));
            FLASH_CARDS.setPreferredSize(new java.awt.Dimension(1920, 940));
            FLASH_CARDS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            EVENT_DISPLAY1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 48)); // NOI18N
            EVENT_DISPLAY1.setText("CREACION DE EVENTO DEPORTIVO");
            FLASH_CARDS.add(EVENT_DISPLAY1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 941, 114));

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

            CREATOR.setBackground(new java.awt.Color(0, 0, 51));
            CREATOR.setPreferredSize(new java.awt.Dimension(1920, 940));
            CREATOR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            crearDeportivo.setText("Crear Evento");
            crearDeportivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            crearDeportivo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    crearDeportivoActionPerformed(evt);
                }
            });
            CREATOR.add(crearDeportivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 760, 220, 80));

            jLabel6.setText("NOMBRE DEL EVENTO");
            CREATOR.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 130, -1));

            evName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CREATOR.add(evName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 230, 40));

            jLabel7.setText("CODIGO");
            CREATOR.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, -1, -1));

            evCode.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CREATOR.add(evCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 230, 40));

            jLabel8.setText("DESCRIPCION");
            CREATOR.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

            jLabel9.setText("RENTA");
            CREATOR.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 380, -1, -1));

            rent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CREATOR.add(rent, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 400, 230, 40));

            jLabel11.setText("EQUIPO 1");
            CREATOR.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, -1, -1));

            T1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CREATOR.add(T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 230, 40));

            jLabel12.setText("EQUIPO 2");
            CREATOR.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 270, -1, -1));

            T2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CREATOR.add(T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, 230, 40));

            jLabel10.setText("FECHA");
            CREATOR.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 270, -1, -1));

            cantPeople.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CREATOR.add(cantPeople, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 230, 40));

            desc.setColumns(20);
            desc.setRows(5);
            desc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jScrollPane1.setViewportView(desc);

            CREATOR.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 400, 200));

            DEIT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CREATOR.add(DEIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 300, 230, 40));

            jLabel13.setText("CANT PERSONAS");
            CREATOR.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, -1, -1));

            SPORT_COMBO.setBackground(new java.awt.Color(40, 40, 40));
            SPORT_COMBO.setMaximumRowCount(3);
            SPORT_COMBO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DEPORTIVO", "MUSICAL", "RELIGIOSO", " " }));
            SPORT_COMBO.setSelectedItem(null);
            SPORT_COMBO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            SPORT_COMBO.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    SPORT_COMBOActionPerformed(evt);
                }
            });
            CREATOR.add(SPORT_COMBO, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 500, 230, 40));

            MUSIC_COMBO.setBackground(new java.awt.Color(40, 40, 40));
            MUSIC_COMBO.setMaximumRowCount(3);
            MUSIC_COMBO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "POP", "ROCK", "RAP", "CLASICA", "REGGEATON", "OTRO", " " }));
            MUSIC_COMBO.setSelectedItem(null);
            MUSIC_COMBO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            MUSIC_COMBO.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    MUSIC_COMBOActionPerformed(evt);
                }
            });
            CREATOR.add(MUSIC_COMBO, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 500, 230, 40));

            sType.setText("TIPO DE DEPORTE");
            CREATOR.add(sType, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 470, -1, -1));

            EVENT_DISPLAY.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 48)); // NOI18N
            EVENT_DISPLAY.setText("CREACION DE EVENTO DEPORTIVO");
            CREATOR.add(EVENT_DISPLAY, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 941, 114));

            cantPeople1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            CREATOR.add(cantPeople1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 230, 40));

            jLabel15.setText("CANT PERSONAS");
            CREATOR.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, -1, -1));

            MainMenu.add(CREATOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 940));

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
        EditarEvento.setVisible(false);
        EliminarEvento.setVisible(false);
        VerEvento.setVisible(false);
        CrearEvento.setVisible(false);
        D.setVisible(true);
        R.setVisible(true);
        M.setVisible(true);
        tuner.setVisible(false);
    }//GEN-LAST:event_CrearEventoActionPerformed

    private void EditarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarEventoActionPerformed
        CrearEvento.setVisible(false);
        EliminarEvento.setVisible(false);
        VerEvento.setVisible(false);
        EditarEvento.setVisible(false);
        tuner.setVisible(false);

    }//GEN-LAST:event_EditarEventoActionPerformed

    private void EliminarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarEventoActionPerformed
        CrearEvento.setVisible(false);
        EditarEvento.setVisible(false);
        VerEvento.setVisible(false);
        EliminarEvento.setVisible(false);
        tuner.setVisible(false);

    }//GEN-LAST:event_EliminarEventoActionPerformed

    private void tunerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tunerActionPerformed
        TUNER(CrearEvento, EditarEvento, EliminarEvento, VerEvento, CrearUser, EditarUser, EliminarUser, tuner);
        CreateUserTemp.setVisible(false);
        eventChooser.setVisible(false);

        CREATOR.setVisible(false);

        this.verEVENTO.setVisible(false);

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

    private void crearDeportivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearDeportivoActionPerformed

        dateSelected = DEIT.getDate();

        if (!evName.getText().isBlank() && !evCode.getText().isBlank() && !desc.getText().isBlank() && !cantPeople.getText().isBlank() && !T1.getText().isBlank() && !T2.getText().isBlank() && dateSelected != null
                && this.SPORT_COMBO.getSelectedItem() != null) {

            switch (selection) {
                case DEPORTIVO:
                    tk.createEvent(Integer.parseInt(cantPeople.getText()), Integer.parseInt(evCode.getText()), evName.getText(), desc.getText(),
                            Double.parseDouble(rent.getText()), tipoEvento.DEPORTIVO, music, tipoDeporte.FUTBOL, T1.getText(), T2.getText());
                    break;
                case MUSICAL:

                    break;
                case RELIGIOSO:
                    break;
            }
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

        } else {
            JOptionPane.showMessageDialog(null, "Llene todos los campos por favor");
        }


    }//GEN-LAST:event_crearDeportivoActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        D.setVisible(false);
        M.setVisible(false);
        R.setVisible(false);
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
        CREATOR.setVisible(false);
        selection = tipoEvento.MUSICAL;
        this.EVENT_DISPLAY.setText("CREACION DE EVENTO MUSICAL");
        this.sType.setText("TIPO DE MUSICA");
        this.MUSIC_COMBO.setVisible(true);
        this.SPORT_COMBO.setVisible(false);

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

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String prov = buscar_evento.getText();
        int cod;
        Evento temp;
        if (!Evento.eventos.isEmpty()) {

            if (!prov.isBlank()) {
                cod = Integer.parseInt(buscar_evento.getText());
                temp = tk.searchEvent(cod);
                if (temp != null) {
                    switch (temp.eventoTipo) {
                        case DEPORTIVO:
                            EventoDeportivo deporte = (EventoDeportivo) temp;
                            this.musicsLabel.setVisible(false);
                            this.convertedPeopleLabel.setVisible(false);
                            deporte.print(cod, this.tipo_evento, this.cantidad_personas, this.codigo_evento, this.titulo_evento, this.descripcion_evento, this.fecha_evento, this.equipo1_evento, this.equipo2_evento, this.teamList1_evento2, this.teamList2_evento,
                                    this.tipoMusica_evento, this.tipoDeporte_evento, this.musicosYcargo_evento, this.convertidos_evento);
                            break;
                        case MUSICAL:
                            break;
                        case RELIGIOSO:
                            break;

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No existe un evento con dicho codigo");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un codigo");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Aun no se han creado eventos");
        }

    }//GEN-LAST:event_searchActionPerformed

    private void SPORT_COMBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPORT_COMBOActionPerformed

    }//GEN-LAST:event_SPORT_COMBOActionPerformed

    private void MUSIC_COMBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MUSIC_COMBOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MUSIC_COMBOActionPerformed

    private void VerEventoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerEventoMousePressed
        VerEvento.setLocation(CrearEvento.getLocation());
        CrearEvento.setVisible(false);
        EditarEvento.setVisible(false);
        EliminarEvento.setVisible(false);
        verEVENTO.setVisible(true);
    }//GEN-LAST:event_VerEventoMousePressed

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
        this.EditarEvento.setVisible(true);
        this.VerEvento.setVisible(true);
        this.EliminarEvento.setVisible(true);
    }//GEN-LAST:event_BACK2MENUActionPerformed

    private void search_FCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_FCActionPerformed

    }//GEN-LAST:event_search_FCActionPerformed

    private void VerEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerEventoActionPerformed
        this.FLASH_CARDS.setVisible(true);
        this.tuner.setVisible(false);
        this.VerEvento.setVisible(false);
        this.setCards(musical, deportivo, religioso);


    }//GEN-LAST:event_VerEventoActionPerformed

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busquedaActionPerformed

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
    private javax.swing.JPanel CREATOR;
    private javax.swing.JButton CrearEvento;
    private javax.swing.JButton CrearUser;
    private javax.swing.JPanel CreateUserTemp;
    private javax.swing.JButton D;
    private com.toedter.calendar.JDateChooser DEIT;
    private javax.swing.JLabel EVENT_DISPLAY;
    private javax.swing.JLabel EVENT_DISPLAY1;
    private javax.swing.JButton EditarEvento;
    private javax.swing.JButton EditarUser;
    private javax.swing.JButton EliminarEvento;
    private javax.swing.JButton EliminarUser;
    private javax.swing.JPanel FLASH_CARDS;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JButton M;
    private javax.swing.JComboBox<String> MUSIC_COMBO;
    private javax.swing.JPanel MainLogin;
    private javax.swing.JPanel MainMenu;
    private javax.swing.JButton R;
    private javax.swing.JLabel RealTime;
    private javax.swing.JComboBox<String> SPORT_COMBO;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JLabel TITLE;
    private javax.swing.JLabel TITLE1;
    private javax.swing.JLabel TITLE5;
    private javax.swing.JLabel TITLE7;
    private javax.swing.JLabel TITLE8;
    private javax.swing.JLabel TITLE9;
    private javax.swing.JButton VerEvento;
    private javax.swing.JComboBox<String> autoridad;
    private javax.swing.JTextField buscar_evento;
    private javax.swing.JTextField busqueda;
    private javax.swing.JTextField cantPeople;
    private javax.swing.JTextField cantPeople1;
    private javax.swing.JLabel cantidad_personas;
    private javax.swing.JLabel codigo_evento;
    private javax.swing.JLabel convertedPeopleLabel;
    private javax.swing.JLabel convertidos_evento;
    private javax.swing.JToggleButton crearDeportivo;
    private javax.swing.JToggleButton create;
    private javax.swing.JTextArea desc;
    private javax.swing.JLabel descripcion_evento;
    private javax.swing.JLabel equipo1_evento;
    private javax.swing.JLabel equipo2_evento;
    private javax.swing.JTextField evCode;
    private javax.swing.JTextField evName;
    private javax.swing.JPanel eventChooser;
    private javax.swing.JLabel fecha_evento;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel musicTypeLabel;
    private javax.swing.JList<String> musicosYcargo_evento;
    private javax.swing.JLabel musicsLabel;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField pw;
    private javax.swing.JTextField rent;
    private javax.swing.JLabel sType;
    private javax.swing.JButton search;
    private javax.swing.JButton search_FC;
    private javax.swing.JLabel sportTypeLabel;
    private javax.swing.JLabel team1Label;
    private javax.swing.JLabel team2Label;
    private javax.swing.JList<String> teamList1_evento2;
    private javax.swing.JList<String> teamList2_evento;
    private javax.swing.JLabel tipoDeporte_evento;
    private javax.swing.JLabel tipoMusica_evento;
    private javax.swing.JLabel tipo_evento;
    private javax.swing.JLabel titulo_evento;
    private javax.swing.JButton tuner;
    private javax.swing.JTextField usernameField;
    private javax.swing.JTextField usuario;
    private javax.swing.JPanel verEVENTO;
    // End of variables declaration//GEN-END:variables
}
