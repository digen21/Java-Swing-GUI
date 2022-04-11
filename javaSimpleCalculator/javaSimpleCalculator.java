private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
                    int no1 = Integer.valueOf(jTextField1.getText());
                    int no2 = Integer.valueOf(jTextField2.getText());
                    String res = Integer.toString(no1+no2);                     //for Plus Button
                    //String res1 = Integer.toString(res);
                    jTextArea1.setText(res);
                    
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
                    int no1 = Integer.valueOf(jTextField1.getText());
                    int no2 = Integer.valueOf(jTextField2.getText());
                    String res = Integer.toString(no1-no2);                     //for Minus Button
                    jTextArea1.setText(res);
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
                     int no1 = Integer.valueOf(jTextField1.getText());
                     int no2 = Integer.valueOf(jTextField2.getText());
                     String res = Integer.toString(no1/no2);                    //for Divison Button
                     jTextArea1.setText(res);
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
                     int no1 = Integer.valueOf(jTextField1.getText());
                     int no2 = Integer.valueOf(jTextField2.getText());
                     String res = Integer.toString(no1*no2);                    //For Multiply Button
                     jTextArea1.setText(res);
    }                                        