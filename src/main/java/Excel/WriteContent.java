package Excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

public class WriteContent {
    static void write(){
        try{
            Workbook wb= new XSSFWorkbook();
            Sheet sh= wb.createSheet("Automation");
            for(int r=0;r<1;r++){
                Row row= sh.createRow(r);
                for(int c=0;c<1;c++){
                    Cell cell=row.createCell(c);
                    cell.setCellValue("Java Program");
                }
            }
            FileOutputStream fout= new FileOutputStream("/Users/prashanthkumar/Downloads/Selenium.xlsx");
            wb.write(fout);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        write();
    }
}
