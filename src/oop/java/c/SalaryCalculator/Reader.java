package oop.java.c.SalaryCalculator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import java.util.HashMap;
import java.util.Map;


public class Reader {
    private String file_name;
    private Map<String, String> emp_salary = new HashMap<String,String>();


    public Reader(){}

    public Reader(String file_name) {
        this.file_name = file_name;
    }

    public Map <String, String> readFile() {
        if (!file_name.equals("Generate")) {
            String file_path = System.getProperty("user.dir") + "\\" + file_name;
            try {
                XSSFWorkbook wb = new XSSFWorkbook(file_path);
                XSSFSheet sheet = wb.getSheet("Sheet1");
                int rows = sheet.getPhysicalNumberOfRows();
                XSSFRow r = sheet.getRow(0);
                int maxCell=  r.getLastCellNum();
                for (int i=maxCell; i != 0; --i){
                    int x = rows;
                    --x;
                    double value = sheet.getRow(x).getCell(i).getNumericCellValue();
                    System.out.println(value);
                    if (x == 1){x = rows;};
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(file_path);
            return  emp_salary;
        }
        else {
            try {
                System.out.println("hi");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return emp_salary;
        }
    }
    public Map<String, String> getEmp_salary () {
        return emp_salary;
    }
    public void setEmp_salary () {
        this.emp_salary = emp_salary;
    }

    //Sheiqmnas dictionary rolmeic sheinaxavs emp_id stvis salary; benefit; deductions
    //metodma daabrunos dict
}
