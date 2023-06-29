/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 25 / may / 2023
 * modificado 11 / Jun / 2023
 * Descripcion: Implememtacion del modelo para ventana Login
 */
package edu.unsis.controller;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import edu.unsis.model.IProductModel;
import edu.unsis.model.ProductModelImpl;
import edu.unsis.model.entity.Product;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class MainMenuController {

    private final IProductModel model = new ProductModelImpl();
    
    /**
     * Method of connection between view with model
     * @return ArrayList with products
     */
    public ArrayList<Product> getData() {
        return model.listAll();
    }
    
    /**
     * Crea un reporte de los productos enviados en la lista
     * @param products 
     */
    public void createReport(ArrayList<Product> products) {
        Document documento = new Document();

        try {

            PdfWriter.getInstance(documento,
                    new FileOutputStream(
                            "/home/elietzer/NetBeansProjects/Abarrotes/ReporteProductos.pdf"));

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Tahoma",
                    14, Font.BOLD));
            parrafo.getFont().setColor(BaseColor.RED);
            parrafo.add("*** Reporte de productos *** \n\n");

            documento.open();
            documento.add(parrafo);

            PdfPTable tablaCliente = new PdfPTable(7);
            tablaCliente.addCell("Nombre");
            tablaCliente.addCell("Código");
            tablaCliente.addCell("Marca");
            tablaCliente.addCell("Modelo");
            tablaCliente.addCell("Price");
            tablaCliente.addCell("Existencia");
            tablaCliente.addCell("Caducidad");

            Paragraph column;
            for (Product product : products) {
                column = new Paragraph(product.getName());
                column.setFont(FontFactory.getFont("Tahoma",
                        12, Font.NORMAL, BaseColor.DARK_GRAY));

                tablaCliente.addCell(column);
                
                column = new Paragraph(product.getCode());
                column.setFont(FontFactory.getFont("Tahoma",
                        12, Font.NORMAL, BaseColor.DARK_GRAY));

                tablaCliente.addCell(column);
                
                column = new Paragraph(product.getMarca());
                column.setFont(FontFactory.getFont("Tahoma",
                        12, Font.NORMAL, BaseColor.DARK_GRAY));

                tablaCliente.addCell(column);
                
                column = new Paragraph(product.getModelo());
                column.setFont(FontFactory.getFont("Tahoma",
                        12, Font.NORMAL, BaseColor.DARK_GRAY));

                tablaCliente.addCell(column);
                
                
                column = new Paragraph(String.valueOf(product.getPrice()));
                column.setFont(FontFactory.getFont("Tahoma",
                        12, Font.NORMAL, BaseColor.DARK_GRAY));

                tablaCliente.addCell(column);
                
                column = new Paragraph(String.valueOf(product.getExistencia()));
                column.setFont(FontFactory.getFont("Tahoma",
                        12, Font.NORMAL, BaseColor.DARK_GRAY));

                tablaCliente.addCell(column);
                
                column = new Paragraph(product.getExpired());
                column.setFont(FontFactory.getFont("Tahoma",
                        12, Font.NORMAL, BaseColor.DARK_GRAY));

                tablaCliente.addCell(column);

            }
            documento.add(tablaCliente);

            Paragraph paragraphTotal = new Paragraph();
            paragraphTotal.setAlignment(Paragraph.ALIGN_CENTER);
            paragraphTotal.setFont(FontFactory.getFont("Tahoma", 12,
                    Font.NORMAL));
            paragraphTotal.getFont().setColor(new BaseColor(25, 190, 55));
            paragraphTotal.add("\n\n* * * Total de productos:: " + products.size());

            documento.add(paragraphTotal);

            parrafo.clear();
            parrafo.setFont(FontFactory.getFont("Tahoma",
                    12, Font.BOLD));
            parrafo.getFont().setColor(BaseColor.BLUE);
            parrafo.add("Fecha .............................. " + new SimpleDateFormat(
                    "yyyy/MM/dd HH:mm:ss").
                format(Calendar.getInstance().getTime()));

            documento.add(parrafo);

            documento.close();
            try {
                File path = new File(
                        "/home/elietzer/NetBeansProjects/Abarrotes/ReporteProductos.pdf");
                Desktop.getDesktop().open(path);
            } catch (IOException e) {
            }

        } catch (DocumentException | IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Error al generar PDF, contacte al administrador");
        }

    }
    
}
