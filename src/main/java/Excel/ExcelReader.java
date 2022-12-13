package Excel;




import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;

public class ExcelReader {
    public static void main(String[] args) {
        read();
    }
    static void read() {
        try
        {
           //      /Users/prashanthkumar/Desktop/JavaTraining/src/main/resources/Testing.xlsx
            String path= System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"Testing.xlsx";
            System.out.println("Path :" +path);
            FileInputStream  fin=new FileInputStream(path);
            Workbook wb= WorkbookFactory.create(fin);
            Sheet sh=wb.getSheet("Sheet2");
            int rc=sh.getPhysicalNumberOfRows();//3
            for(int r=0;r<rc;r++) {
                Row row=sh.getRow(r);
                int cc=row.getPhysicalNumberOfCells();//2
                for(int c=0;c<cc;c++) {
                    Cell cell=row.getCell(c);
                    String data=cell.getStringCellValue();
                    System.out.printf("%-12s",data);
                }
                System.out.println();
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
