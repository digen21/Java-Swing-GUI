  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        jTextArea1.append("Name: " + jTextField1.getText() + "\n");

        jTextArea1.append("Father's Name: " + jTextField2.getText() + "\n");
        
        
        //for radio button
        String gender;
        if (jRadioButton1.isSelected()) {
            gender = "Male";
        } else if (jRadioButton1.isSelected()) {
            gender = "female";
        } else {
            gender = "";
        }

        jTextArea1.append("Gender: " + gender + "\n");

        
        //for combo boxes
        jTextArea1.append("courses: " + jComboBox1.getSelectedItem() + "\n");
        
        
        
        // For Address
        jTextArea1.append("Address: " + jTextArea2.getText() + "\n");
        
        //for list
        //for(String item : jList1.getSelectedValuesList())
        
        jTextArea1.append("Selected: " +  jList1.getSelectedValuesList());
        
//        if(jList1.getSelectedValue() == null)
//        {
//            jTextArea1.append("Selected College: " + jList1.getSelectedValue());
//        }
//        else
//        {
//            jTextArea1.append("Selected College: " + jList1.getSelectedValue());
//        }
      jTextArea1.append("\n" + " -------------------------------------------------------------------" + "\n");  
    }                                        

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             