package Probleme;

import java.awt.Container;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TacheComplexeSwing {
    private TacheComplexe tache;
    final JFrame fenetre = new JFrame("Nouvelle Tache");
    final private JTextField valeurNom = new JTextField(10);
    final private JTextField valeurCout = new JTextField(10);
    final private JButton boutonAjouter = new JButton("ajouter");
    final private JButton boutonQuitter = new JButton("Quitter");

    public TacheComplexeSwing(TacheComplexe tache) {
        this.tache = tache;
        Container c = fenetre.getContentPane();
        c.setLayout(new BorderLayout());
        JPanel informations = new JPanel(new GridLayout(2, 2));
        informations.add(new JLabel("Nom: "), 0);
        informations.add(valeurNom);
        informations.add(new JLabel("Cout: ", 0));
        informations.add(valeurCout);
        c.add(informations, BorderLayout.CENTER);

        JPanel boutons = new JPanel(new FlowLayout());
        boutons.add(boutonAjouter);
        boutons.add(boutonQuitter);

        this.boutonAjouter.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {

                try {
                    valeurCout.setBackground(Color.WHITE);
                    ITache nouvTache = new TacheElementaire(valeurNom.getText(),
                            Integer.parseInt(valeurCout.getText()));
                    tache.ajouter(nouvTache);
                    valeurNom.setText("");

                } catch (NumberFormatException formatException) {
                    valeurCout.setBackground(Color.RED);
                }
                valeurCout.setText("");
            }

        });

        this.boutonQuitter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                fenetre.dispose();
                System.exit(0);
            }
        });
        c.add(boutons, BorderLayout.SOUTH);

        fenetre.pack();
        fenetre.setVisible(true);

    }

    public static void main(String[] args) {

        TacheComplexe tacheComplexe = new TacheComplexe("new tache");

        TacheComplexeSwing ts= new TacheComplexeSwing(tacheComplexe);
    }

}
