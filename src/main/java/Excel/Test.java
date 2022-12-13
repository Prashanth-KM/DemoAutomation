package Excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args){
        write();
    }
    static void write(){
        String s[]= {"Sunday","Monday","Tuesday"};
        String s1[]={"Wednesday","Thursday","Friday","Saturday"};
        try {
            Workbook wb=new XSSFWorkbook();
            Sheet sh=wb.createSheet("WeekDays");
            for(int r=0;r<1;r++) {
                Row row=sh.createRow(r);
                Row row1=sh.createRow(r+1);

                for(int c=0;c<s.length;c++) {
                    Cell cell=row.createCell(c);
                    cell.setCellValue(s[c]);
                }
                for(int c=0;c<s1.length;c++) {
                    Cell cell=row1.createCell(c);
                    cell.setCellValue(s1[c]);
                }
                FileOutputStream fout=new FileOutputStream("/Users/prashanthkumar/Downloads/Weeks.xlsx");
                wb.write(fout);
        }
    }catch(Exception e) {
        e.printStackTrace();
    }
    }
}
