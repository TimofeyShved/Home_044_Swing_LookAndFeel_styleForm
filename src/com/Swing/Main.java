package com.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Main {

    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        // создаем окно и панель для него
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        // список стилей
        UIManager.LookAndFeelInfo[] lookAndFeelInfos = UIManager.getInstalledLookAndFeels();

        for (UIManager.LookAndFeelInfo lookAndFeelInfo:lookAndFeelInfos){
            System.out.println(lookAndFeelInfo.getName()); // выводим имя
            System.out.println(lookAndFeelInfo.getClassName()); // класс стиля
        }

        // создаем кнопку и добавляем её на панель
        JButton jButton = new JButton("Metal");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {// добавляем действие на кнопку
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel"); // изменяем стиль формы
                    SwingUtilities.updateComponentTreeUI(jFrame);                       // обновляем форму
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        // создаем кнопку и добавляем её на панель
        JButton jButton1 = new JButton("Nimbus");
        jPanel.add(jButton1);
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {// добавляем действие на кнопку
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");// изменяем стиль формы
                    SwingUtilities.updateComponentTreeUI(jFrame);                       // обновляем форму
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        // создаем кнопку и добавляем её на панель
        JButton jButton2 = new JButton("CDE/Motif");
        jPanel.add(jButton2);
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {// добавляем действие на кнопку
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");// изменяем стиль формы
                    SwingUtilities.updateComponentTreeUI(jFrame);                              // обновляем форму
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        // создаем кнопку и добавляем её на панель
        JButton jButton3 = new JButton("Windows");
        jPanel.add(jButton3);
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {// добавляем действие на кнопку
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// изменяем стиль формы
                    SwingUtilities.updateComponentTreeUI(jFrame);                                   // обновляем форму
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        JButton jButton4 = new JButton("Windows Classic");
        jPanel.add(jButton4);
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {// добавляем действие на кнопку
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");// изменяем стиль формы
                    SwingUtilities.updateComponentTreeUI(jFrame);                                       // обновляем форму
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        // список событый формы
        jFrame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) { //окно открыто

            }

            @Override
            public void windowClosing(WindowEvent e) {// закрытие окна

            }

            @Override
            public void windowClosed(WindowEvent e) { // окно закрыто

            }

            @Override
            public void windowIconified(WindowEvent e) { // Значок окна установлен

            }

            @Override
            public void windowDeiconified(WindowEvent e) {// Значок окна не установлен

            }

            @Override
            public void windowActivated(WindowEvent e) { // окно Активировано

            }

            @Override
            public void windowDeactivated(WindowEvent e) { // окно не Активировано

            }
        });
    }

    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};//наш класс, для запуска программы
        jFrame.setVisible(true);// делаем видимость
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// добавляем операцию для выхода
        Toolkit toolkit = Toolkit.getDefaultToolkit();// набор инструментов, с нашими JFrame
        Dimension dimension = toolkit.getScreenSize(); //возвращяет значения нашего экрана
        // размеры окна
        jFrame.setBounds(dimension.width/2 - 250, dimension.height/2 -150, 500, 300);
        jFrame.setTitle("Style form");// надпись Title
        //jFrame.setIconImage(путь);
        return jFrame;
    }
}
