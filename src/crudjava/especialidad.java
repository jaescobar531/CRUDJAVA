
package crudjava;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class especialidad extends javax.swing.JFrame {

    conexion con1 = new conexion ();
    Connection cn=con1.conectar();
    //DefaultTableModel model;
    Statement st;//hace la ejecucion en la base de datos
    //ResultSet rs;//trae el resultado que se hace en la base de datos
    
    public especialidad() {
        initComponents();
        //listar();
        mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEspecialidad = new RSMaterialComponent.RSTableMetro();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        especial = new javax.swing.JTextField();
        nuevo = new javax.swing.JButton();
        insertar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TablaEspecialidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaEspecialidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaEspecialidadMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaEspecialidad);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Especialidad");

        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        insertar.setText("Insertar");
        insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarActionPerformed(evt);
            }
        });

        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jLabel2.setText("Codigo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(nuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insertar)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(actualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminar))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(id, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(especial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(especial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo)
                    .addComponent(insertar)
                    .addComponent(actualizar)
                    .addComponent(eliminar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        
        nuevo();
    }//GEN-LAST:event_nuevoActionPerformed

    private void insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarActionPerformed
        
        insertar();
        mostrar();
        //listar();
        nuevo();
    }//GEN-LAST:event_insertarActionPerformed

    private void TablaEspecialidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEspecialidadMouseClicked
        int filaSeleccionada = TablaEspecialidad.rowAtPoint(evt.getPoint());
        especial.setText(TablaEspecialidad.getValueAt(filaSeleccionada, 0).toString());
        id.setText(TablaEspecialidad.getValueAt(filaSeleccionada, 1).toString());
    }//GEN-LAST:event_TablaEspecialidadMouseClicked

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        actualizar();
        nuevo();
        mostrar();
    }//GEN-LAST:event_actualizarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        eliminar();
        mostrar();
        nuevo();
    }//GEN-LAST:event_eliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new especialidad().setVisible(true);
            }
        });
    }
    
    /*void listar (){
        String sql = "select * from especialidad";
        try{
            cn = con1.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            //se declara un objeto array de 1 campos
            Object[] esp = new Object[1];
            model = (DefaultTableModel)TablaEspecialidad.getModel();
            while(rs.next()){
                esp[0] = rs.getString("especialidad");
                
                model.addRow(esp);
            }
            TablaEspecialidad.setModel(model);//pinta o llena la tabla en la vista
        }catch (Exception e){
            
        }        
    }*/
    /*void agregar(){
        String espe  = especial.getText();//envia el texto que este en nombres y lo guarda en especial son los nombres que se le ponen en en texfield       
        try{
            if(espe.equals("")){
                JOptionPane.showMessageDialog(null,"No puede existir campos vacios");
                limpiar(model);
            }else{
                String sql="insert into especialidad(especialidad) values ('"+espe+"')";
                cn=con1.conectar();
                st=cn.createStatement();
                st.executeUpdate(sql);//ejecuta la insersion de los datos en la tabla y en la bd
                JOptionPane.showMessageDialog(null,"Se insertaron los datos");
                limpiar(model);
            }
        }catch(Exception e){
        
        }
    }*/
    /*void limpiar(DefaultTableModel model){
        for(int i=0; i<=TablaEspecialidad.getRowCount(); i++){
            model.removeRow(i);
            i = i-1;
        }
    }*/
    void nuevo(){
        especial.setText("");//estos son los nombres que pusimos en el texfield
        id.setText("");
        especial.requestFocus();
    }
    
    
    
    //********************************************************
    
    public void insertar(){
        
        try{
            String SQL = "insert into especialidad(especialidad,id) values (?,?)";
            PreparedStatement pst=cn.clientPrepareStatement(SQL);
            
            pst.setString(0, especial.getText());
            pst.setString(1, id.getText());
            if(especial.getText().equals("")||id.getText().equals("")){
                JOptionPane.showMessageDialog(null,"No puede existir campos vacios");
            }else {
                pst.execute();
                JOptionPane.showMessageDialog(null,"Especiaidad ingresada");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"error de registro " +e.getMessage());
        }
    }
    public void mostrar() {
        String[] titulos={"Especialidad","Id"};
        String[] registros = new String[2];
        
        DefaultTableModel modelo= new DefaultTableModel(null, titulos);
        
        String SQL = "select * from especialidad";
        
        try{
            Statement st=cn.createStatement();//hace la ejecucion en la base de datos
            ResultSet rs=st.executeQuery(SQL);//trae el resultado que se hace en la base de datos
            while(rs.next()){
                registros[0] = rs.getString("especialidad");//columnas de la bd
                registros[1] = rs.getString("id");
                modelo.addRow(registros);
            }
            TablaEspecialidad.setModel(modelo);//pinta o llena la tabla en la vista
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"error al mostrar datos " +e.getMessage());
        }
        
    }
    public void actualizar(){
        
        try{
            String SQL = "update especialidad set especialidad=?,id=? where id=?";
            int filaSeleccionada=TablaEspecialidad.getSelectedRow();
            String dao=(String)TablaEspecialidad.getValueAt(filaSeleccionada, 1);
            PreparedStatement pst=cn.clientPrepareStatement(SQL);
            
            pst.setString(1, especial.getText());
            pst.setString(2, id.getText());
            pst.setString(3, dao);
            if(especial.getText().equals("")||id.getText().equals("")){
                JOptionPane.showMessageDialog(null,"No puede existir campos vacios");
            }else {
                pst.execute();
                JOptionPane.showMessageDialog(null,"Especiaidad actualizada");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"error de actualización " +e.getMessage());
        }
    }
    
    public void eliminar(){
        int filaSeleccionada=TablaEspecialidad.getSelectedRow();
        //String valor = especial.getText();
        try{
            String SQL="delete from especialidad where id="+TablaEspecialidad.getValueAt(filaSeleccionada, 1);
            
            st=cn.createStatement();
            int n=st.executeUpdate(SQL);
            //if(n>=0){
                JOptionPane.showMessageDialog(null,"Registro eliminado " );
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"error de eliminación de especialidad " +e.getMessage());
        }
    }
    /*void eliminar(){
        String cod = id.getText();
        
        try{
            if(cod != null){
                String sql = "delete from especialidad where id="+cod;
                cn = con1.conectar();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
                
            }
        }catch(Exception e){
            
        }
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSTableMetro TablaEspecialidad;
    private javax.swing.JButton actualizar;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField especial;
    private javax.swing.JTextField id;
    private javax.swing.JButton insertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nuevo;
    // End of variables declaration//GEN-END:variables
}
