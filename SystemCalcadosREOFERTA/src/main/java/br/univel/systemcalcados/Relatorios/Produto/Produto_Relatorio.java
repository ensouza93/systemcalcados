package br.univel.systemcalcados.Relatorios.Produto;


import br.univel.systemcalcados.Conexao.Conexao;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Smart Web
 */
public class Produto_Relatorio {

    public Produto_Relatorio() {

        String outFileName = "produto.pdf";

        try {

            Connection conexaoBanco = Conexao.getConnection();
            HashMap<String, Object> parametros = new HashMap<String, Object>();

            InputStream is = getClass().getResourceAsStream("produto.jasper");

            JasperPrint print = JasperFillManager.fillReport(is,
                    parametros, conexaoBanco);

            JRExporter exporter = new net.sf.jasperreports.engine.export.JRPdfExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
            exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME,
                    outFileName);
            exporter.exportReport();
            JOptionPane.showMessageDialog(null, "Relatório Gerado!");
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Erro!");
            e.printStackTrace();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro!");
            e.printStackTrace();

        }

        try {
            Desktop.getDesktop().open(new File(outFileName));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
