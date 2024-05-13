import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM extends JFrame {
    private JTextField passwordField, oldPasswordField, newPasswordField,mablagh,kart;
    private JLabel resultLabel, mlabel, reslabel,c,d;
    private long  balance = 10000000;
    private String password = "1234";
    private JPanel panel3, panel1, panel2, panel4, panel5, panel6, panelres,panel7;
    private JButton lan1, back,sabt,hh,bb;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ATM();
            }
        });
    }

    public ATM() {
        setTitle("ATM");
        Dimension frameSize = new Dimension(540, 360);
        //panelres
        panelres = new JPanel();
        panelres.setBackground(Color.blue);
        reslabel = new JLabel("عملیات با موفقیت انجام شد");
        reslabel.setForeground(Color.white);
        reslabel.setBounds(220, 100, 200, 30);
        panelres.add(reslabel);
        back = new JButton("بازگشت");
        back.setBounds(170, 290, 200, 30);
        panelres.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                repaint();
                add(panel3);
                setVisible(true);
            }
        });

        // panel1
        panel1 = new JPanel();
        panel1.setBackground(Color.blue);
        lan1 = new JButton("فارسی");
        JButton lan2 = new JButton("english");
        lan1.setBounds(430, 120, 100, 50);
        lan2.setBounds(0, 120, 100, 50);
        panel1.add(lan1);
        panel1.add(lan2);

        //panel2
        panel2 = new JPanel();
        panel2.setBackground(Color.blue);
        JLabel a = new JLabel("رمز عبور را وارد کنید:");
        a.setBounds(215, 90, 100, 50);
        a.setForeground(Color.white);
        passwordField = new JPasswordField(10);
        passwordField.setBounds(215, 140, 100, 30);
        JButton lbutton = new JButton(" ورود");
        lbutton.setBounds(215, 180, 100, 30);
        lbutton.addActionListener(e -> authenticate());
        panel2.add(a);
        panel2.add(passwordField);
        panel2.add(lbutton);

        //panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(Color.blue);
        JButton a1 = new JButton("تغییر رمز");
        JButton a2 = new JButton(" اعلام موجودی");
        JButton a3 = new JButton("برداشت وجه");
        JButton a4 = new JButton("کارت به کارت ");
        a1.setBounds(430, 120, 100, 50);
        a2.setBounds(430, 180, 100, 50);
        a3.setBounds(0, 120, 100, 50);
        a4.setBounds(0, 180, 100, 50);
        panel3.add(a1);
        panel3.add(a3);
        panel3.add(a2);
        panel3.add(a4);
        bb = new JButton("بازگشت");
        bb.setBounds(170, 290, 200, 30);
        panel3.add(bb);
        bb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                repaint();
                add(panel1);
                setVisible(true);
            }
        });

        //panel4(taghir ramz)
        panel4 = new JPanel();
        panel4.setBackground(Color.blue);
        back = new JButton("بازگشت");
        resultLabel = new JLabel("");
        JLabel passwordLabel = new JLabel("تغییر رمز عبور:");
        oldPasswordField = new JTextField(10);
        newPasswordField = new JTextField(10);
        JButton passwordButton = new JButton("تغییر رمز عبور");
        passwordLabel.setForeground(Color.white);
        resultLabel.setForeground(Color.white);
        passwordLabel.setBounds(250, 70, 100, 50);
        oldPasswordField.setBounds(230, 120, 100, 30);
        newPasswordField.setBounds(230, 160, 100, 30);
        passwordButton.setBounds(230, 200, 100, 30);
        resultLabel.setBounds(230, 240, 200, 30);
        back.setBounds(170, 290, 200, 30);
        passwordButton.addActionListener(e -> changePassword());

        panel4.add(resultLabel);
        panel4.add(passwordLabel);
        panel4.add(oldPasswordField);
        panel4.add(newPasswordField);
        panel4.add(passwordButton);
        hh = new JButton("بازگشت");
        hh.setBounds(170, 290, 200, 30);
        panel4.add(hh);
        hh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                repaint();
                add(panel3);
                setVisible(true);
            }
        });


        //panel5(elam mujidi)
        panel5 = new JPanel();
        panel5.setBackground(Color.blue);
        mlabel = new JLabel("موجودی حساب شما:" + balance);
        mlabel.setForeground(Color.white);
        mlabel.setBounds(220, 100, 200, 30);
        panel5.add(mlabel);
        hh = new JButton("بازگشت");
        hh.setBounds(170, 290, 200, 30);
        panel5.add(hh);
        hh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                repaint();
                add(panel3);
                setVisible(true);
            }
        });


        //panel6(bardasht vajh)
        panel6 = new JPanel();
        panel6.setBackground(Color.blue);
        JButton m1 = new JButton("1500000");
        JButton m2 = new JButton(" 2000000");
        JButton m3 = new JButton("500000 ");
        JButton m4 = new JButton("1000000");
        m1.setBounds(430, 120, 100, 50);
        m2.setBounds(430, 180, 100, 50);
        m3.setBounds(0, 120, 100, 50);
        m4.setBounds(0, 180, 100, 50);
        panel6.add(m1);
        panel6.add(m2);
        panel6.add(m3);
        panel6.add(m4);
        hh = new JButton("بازگشت");
        hh.setBounds(170, 290, 200, 30);
        panel6.add(hh);
        hh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                repaint();
                add(panel3);
                setVisible(true);
            }
        });


        //panel7(kart be kart)
        panel7 = new JPanel();
        panel7.setBackground(Color.blue);
        c = new JLabel("مبلغ مورد نظر را انتخاب کنید:");
        d = new JLabel("شماره کارت مورد نظر را انتخاب کنید:");
        mablagh = new JTextField(10);
        kart = new JTextField(10);
        sabt = new JButton("ثبت");
        c.setForeground(Color.white);
        d.setForeground(Color.white);
        c.setBounds(215,60,140,50);
        mablagh.setBounds(205,100,140,30);
        d.setBounds(205,140,160,50);
        kart.setBounds(205,180,140,30);
        sabt.setBounds(215,220,100,20);
        panel7.add(c);
        panel7.add(mablagh);
        panel7.add(d);
        panel7.add(kart);
        panel7.add(sabt);
        panel7.add(back);


        // Layouts
        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null);
        panel4.setLayout(null);
        panel5.setLayout(null);
        panel6.setLayout(null);
        panel7.setLayout(null);
        panelres.setLayout(null);
        add(panel1);

        a1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                repaint();
                add(panel4);
                setVisible(true);
            }
        });
        lan1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                repaint();
                add(panel2);
                setVisible(true);
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                repaint();
                add(panel3);
                setVisible(true);
            }
        });
        a2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                repaint();
                add(panel5);
                setVisible(true);
            }
        });
        a3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                repaint();
                add(panel6);
                setVisible(true);
            }
        });
        a4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                repaint();
                add(panel7);
                setVisible(true);
            }
        });
        m1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long amount = 1500000;
                if (amount > balance) {
                    JOptionPane.showMessageDialog(ATM.this, "موجودی کافی نیست", "خطا", JOptionPane.ERROR_MESSAGE);
                } else {
                    balance -= amount;
                    mlabel.setText("موجودی حساب شما: " + balance);
                }

                getContentPane().removeAll();
                repaint();
                add(panelres);
                setVisible(true);
            }
        });
        m2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long amount = 2000000;
                if (amount > balance) {
                    JOptionPane.showMessageDialog(ATM.this, "موجودی کافی نیست", "خطا", JOptionPane.ERROR_MESSAGE);
                } else {
                    balance -= amount;
                    mlabel.setText("موجودی حساب شما: " + balance);
                }

                getContentPane().removeAll();
                repaint();
                add(panelres);
                setVisible(true);
            }
        });
        m3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long amount = 500000;
                if (amount > balance) {
                    JOptionPane.showMessageDialog(ATM.this, "موجودی کافی نیست", "خطا", JOptionPane.ERROR_MESSAGE);
                } else {
                    balance -= amount;
                    mlabel.setText("موجودی حساب شما: " + balance);
                }

                getContentPane().removeAll();
                repaint();
                add(panelres);
                setVisible(true);
            }
        });
        m4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long amount = 1000000;
                if (amount > balance) {
                    JOptionPane.showMessageDialog(ATM.this, "موجودی کافی نیست", "خطا", JOptionPane.ERROR_MESSAGE);
                } else {
                    balance -= amount;
                    mlabel.setText("موجودی حساب شما: " + balance);
                }

                getContentPane().removeAll();
                repaint();
                add(panelres);
                setVisible(true);
            }
        });

        //kart be kart pul kamshe
        sabt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount2 = Double.parseDouble(mablagh.getText());
                if (amount2 > balance) {
                    JOptionPane.showMessageDialog(ATM.this, "موجودی کافی نیست", "خطا", JOptionPane.ERROR_MESSAGE);
                } else {
                    balance -= amount2;
                    mlabel.setText("موجودی حساب شما: " + balance);
                }

                getContentPane().removeAll();
                repaint();
                add(panelres);
                setVisible(true);
            }
        });


        setSize(frameSize);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    //pass change
    private void changePassword() {
        if (oldPasswordField.getText().equals(password)) {
            password = newPasswordField.getText();
            resultLabel.setText("رمز عبور با موفقیت تغییر یافت");
        } else {
            resultLabel.setText("رمز عبور قدیمی نادرست است");
        }
    }

    // pass entry
    private void authenticate() {
        String enteredPassword = passwordField.getText();
        if (enteredPassword.equals(password)) {
            getContentPane().removeAll();
            add(panel3);
            revalidate();
            repaint();
        } else {
            JOptionPane.showMessageDialog(this, "رمز عبور نادرست است", "خطا", JOptionPane.ERROR_MESSAGE);
        }
    }
}
//JOptionPane.showMessageDialog(this, "رمز عبور نادرست است", "خطا", JOptionPane.ERROR_MESSAGE); ایده این در یک ویدئو یوتیوب پبدا شده است