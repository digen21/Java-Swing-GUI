private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //For First Name...
       jTextArea2.append("First Name: " + jTextField1.getText() + "\n");
       jTextArea2.append("Middle Name: " + jTextField2.getText() + "\n");
       jTextArea2.append("Last Name: " + jTextField3.getText() + "\n");
       
       
       //for selecting radio button
       String gender;
       if(jRadioButton1.isSelected())
       {
           gender = "Male";
       }
       else if(jRadioButton2.isSelected())
       {
           gender = "female";
       }
       else
       {
           gender = "other";
       }
       jTextArea2.append("Gender: " + gender + "\n");
       
       
       //for check box....
       if(jCheckBox1.isSelected())
       {
           jTextArea2.append("Marks: " + jCheckBox1.getText() + "\n");
       }
           else if(jCheckBox2.isSelected())
                {
                   jTextArea2.append("Marks: " + jCheckBox2.getText() + "\n");
                }
       else if(jCheckBox3.isSelected())
                {
                   jTextArea2.append("Marks: " + jCheckBox3.getText() + "\n");
                }
       else if(jCheckBox4.isSelected())
                {
                   jTextArea2.append("Marks: " + jCheckBox4.getText() + "\n");
                }
       
       //for list multiple selection
       jTextArea2.append("Selected: " +  jList1.getSelectedValuesList() + "\n");
       
       //for combo box
       jTextArea2.append("City: " + jComboBox1.getSelectedItem() + "\n");
       
       //address
       jTextArea2.append("Address: " + jTextArea1.getText() + "\n");
       
       //
       
    }                                        