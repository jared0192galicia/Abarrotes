/**
 * Autor: Galicia Cordova Elietzer Jared
 * Creado el: 19 / Jun / 2023
 * modificado: 19 / Jun / 2023
 * Descipciòn: Implementacion del CRUD basico en mysql para productos
 */
package edu.unsis.model;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import edu.unsis.dao.CRUD;
import edu.unsis.dao.SaleDAOImpl;
import edu.unsis.model.entity.Product;
import edu.unsis.model.entity.Sale;
import edu.unsis.model.entity.User;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class SaleModelImpl implements ISaleModel {

    private final CRUD dao = new SaleDAOImpl();

    @Override
    public ArrayList<Sale> listAll() {
        return dao.listAll();
    }

    @Override
    public boolean createRegister(Sale sale) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean updateRegister(Sale sale, String code) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deleteRegister(String code) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   

    @Override
    public void createReport(ArrayList<Product> products, Sale sale, String root) {
        User user = UserModelImpl.getLoggedUser();
        Document documento = new Document();
//        Document documento = new Document(new Rectangle(400, 800));

        try {

//            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento,
                    new FileOutputStream(root + "Reporte.pdf"));

//            com.itextpdf.text.Image header = 
//                    com.itextpdf.text.Image.getInstance("src/images/BannerPDF.jpg");
//            header.scaleToFit(650, 1000);
//            header.setAlignment(Chunk.ALIGN_CENTER);
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Tahoma",
                    14, Font.BOLD));
            parrafo.getFont().setColor(BaseColor.RED);
            parrafo.add("*** Abarrotes *** \n\n");

            documento.open();
//            documento.add(header);
            documento.add(parrafo);

            PdfPTable tablaCliente = new PdfPTable(2);
            tablaCliente.addCell("Nombre");
            tablaCliente.addCell("Price");

            // Add all prodcuts to list
            Paragraph column;
            for (Product product : products) {
                column = new Paragraph(product.getName());
                column.setFont(FontFactory.getFont("Tahoma",
                        12, Font.NORMAL, BaseColor.DARK_GRAY));

                // Add data to table
                tablaCliente.addCell(column);
                tablaCliente.addCell(String.valueOf(product.getPrice()));

            }
            documento.add(tablaCliente);

            Paragraph parrafo2 = new Paragraph();
            parrafo2.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo2.add("\n\n* * * Atendido Por: " + user.getName() + " * * *");
            parrafo2.setFont(FontFactory.getFont("Tahoma", 12,
                    Font.NORMAL));
            parrafo2.getFont().setColor(BaseColor.RED);

            Paragraph paragraphTotal = new Paragraph();
            paragraphTotal.setAlignment(Paragraph.ALIGN_CENTER);
            paragraphTotal.setFont(FontFactory.getFont("Tahoma", 12,
                    Font.NORMAL));
            paragraphTotal.getFont().setColor(new BaseColor(25, 190, 55));
            paragraphTotal.add("\n\n* * * Total: " + sale.getIncome() + " * * *");

            documento.add(paragraphTotal);
            
            parrafo.clear();
            parrafo.setFont(FontFactory.getFont("Tahoma",
                    12, Font.BOLD));
            parrafo.getFont().setColor(BaseColor.BLUE);
            parrafo.add("Fecha .............................. " + sale.getDate());
            
            documento.add(parrafo);
            documento.add(parrafo2);

            documento.close();
            try {
                File path = new File(root + "Reporte.pdf");
                Desktop.getDesktop().open(path);
            } catch (IOException e) {
                System.out.println("Error " + e);
            }

        } catch (DocumentException | IOException e) {
            System.err.println("Error en PDF o ruta de imagen" + e);
            JOptionPane.showMessageDialog(null,
                    "Error al generar PDF, contacte al administrador");
        }

    }
}
