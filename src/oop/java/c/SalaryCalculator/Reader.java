package oop.java.c.SalaryCalculator;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import java.util.HashMap;
import java.util.Map;


public  class Reader {
    private String file_name;
    private Map<String, String> emp_salary = new HashMap<String,String>();

    public Reader(){}

    public Reader(String file_name) {
        this.file_name = file_name;
    }

    public String readFile()throws IOException{
        String file_path = System.getProperty("user.dir")+"\\"+file_name;
        try {
            File file = new File(file_path);
            FileInputStream fis = new FileInputStream(file);
            HSSFWorkbook wb=new HSSFWorkbook(fis);
            HSSFSheet sheet=wb.getSheetAt(0);
            FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();
            for(Row row: sheet)     //iteration over row using for each loop
            {
                for(Cell cell: row)    //iteration over cell using for each loop
                {
                    switch(formulaEvaluator.evaluateInCell(cell).getCellType())
                    {
                        case Cell.CELL_TYPE_NUMERIC:   //field that represents numeric cell type
//getting the value of the cell as a number
                            System.out.print(cell.getNumericCellValue()+ "\t\t");
                            break;
                        case Cell.CELL_TYPE_STRING:    //field that represents string cell type
//getting the value of the cell as a string
                            System.out.print(cell.getStringCellValue()+ "\t\t");
                            break;
                    }
                }
                System.out.println();
            }


}
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(file_path);
        return file_path;
    }
    public void setEmp_salary(){
        this.emp_salary = emp_salary;
    }
    public Map <String, String> getEmp_salary(){
        return emp_salary;
    }

    //Sheiqmnas dictionary rolmeic sheinaxavs emp_id stvis salary; benefit; deductions
    //metodma daabrunos dict
}
