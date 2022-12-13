package Excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileOutputStream;

public class ExcelWriter {
    public static void main(String[] args) {
        writeContent();
    }

    static void writeContent() {
        String s[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        try {
            Workbook wb=new XSSFWorkbook();
            Sheet sh=wb.createSheet("WeekDays");
            for(int r=0;r<1;r++) {
                Row row=sh.createRow(r);
                for(int c=0;c<s.length;c++) {
                    Cell cell=row.createCell(c);
                    cell.setCellValue(s[c]);
                }
                FileOutputStream fout=new FileOutputStream("/Users/prashanthkumar/Downloads/WeeksInCell.xlsx");
                wb.write(fout);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }

    }
}
