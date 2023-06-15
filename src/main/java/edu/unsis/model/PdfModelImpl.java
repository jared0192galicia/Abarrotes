package edu.unsis.model;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import edu.unsis.model.entity.Product;
import edu.unsis.model.entity.User;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author elietzer
 */
public class PdfModelImpl implements IPdfModel {

    @Override
    public void createReport(ArrayList<Product> products, String root, String total) {
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

                /**
                 * ALIM20231B1B8IALIM20232C5F6GALIM20233D2C7HALIM20234E0A6GALIM20236G0A1B
                 */
            }
            documento.add(tablaCliente);

            Paragraph parrafo2 = new Paragraph();
            parrafo2.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo2.add("\n\n* * * Atendido Por " + user.getName() + " * * *");
            parrafo2.setFont(FontFactory.getFont("Tahoma", 12,
                    Font.NORMAL));
            parrafo2.getFont().setColor(BaseColor.RED);
            
            Paragraph paragraphTotal = new Paragraph();
            paragraphTotal.setAlignment(Paragraph.ALIGN_CENTER);
            paragraphTotal.add("\n\n* * * Total: " + total + " * * *");
            paragraphTotal.setFont(FontFactory.getFont("Tahoma", 12,
                    Font.NORMAL));
            paragraphTotal.getFont().setColor( new BaseColor(25, 190, 55));

            documento.add(paragraphTotal);
            documento.add(parrafo2);

            documento.close();
            JOptionPane.showMessageDialog(null,
                    "Reporte creado correctamente.");

        } catch (DocumentException | IOException e) {
            System.err.println("Error en PDF o ruta de imagen" + e);
            JOptionPane.showMessageDialog(null,
                    "Error al generar PDF, contacte al administrador");
        }

    }

}
