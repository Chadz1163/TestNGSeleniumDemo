package UITest.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

/**
 * @author 77932
 * 读取多套数据
 */
public class ExcelUtility {

    private static XSSFWorkbook ExcelWBook;
    private static XSSFSheet ExcelWSheet;


    /**
     * 设置文件路径, 打开 Excel 文件
     *
     * @params - Excel 路径 and 表单名字
     */
    public static void setExcelFile(String path, String sheetName) throws Exception {
        try {
            // 打开 Excel 文件
            FileInputStream excelFile = new FileInputStream(path);

            // 访问excel表
            ExcelWBook = new XSSFWorkbook(excelFile);
            ExcelWSheet = ExcelWBook.getSheet(sheetName);
        } catch (Exception e) {
            throw (e);
        }
    }

    public static String[][] getTestData(String dataBoundary) {
        String[][] testData = null;

        try {
            // DataFormatter对象用于处理单元格中的数字和字符串的
            DataFormatter formatter = new DataFormatter();
            // BoundaryCells 数组里放的是第一列和最后一列两个元素
            // 根据第一列和最后一列, 可以知道读哪些行数据
            XSSFCell[] boundaryCells = findCells(dataBoundary);
            // 单元格开始处
            XSSFCell startCell = boundaryCells[0];
            // 单元格结束处
            XSSFCell endCell = boundaryCells[1];

            // 根据开始/结束单元格找到数据开始/结束の行和列
            int startRow = startCell.getRowIndex() + 1;
            int startCol = startCell.getColumnIndex() + 1;
            int endRow = endCell.getRowIndex() - 1;
            int endCol = endCell.getColumnIndex() - 1;

            // 创建二维数组存放数据
            testData = new String[endRow - startRow + 1][endCol - startCol + 1];

            for (int i = startRow; i <= endRow; i++) {
                for (int j = startCol; j <= endCol; j++) {
                    Cell cell = ExcelWSheet.getRow(i).getCell(j);
                    // i - startRow 与 j - startCol作为二维数组的索引
                    // formatter.formatCellValue(cell) 将cell对象中的值转为String
                    testData[i - startRow][j - startCol] = formatter.formatCellValue(cell);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 返回这个二维数组
        return testData;
    }

    public static XSSFCell[] findCells(String tableName) {
        DataFormatter formatter = new DataFormatter();
        String pos = "begin";
        XSSFCell[] cells = new XSSFCell[2];

        for (Row row : ExcelWSheet) {
            for (Cell cell : row) {
                // if (tableName.equals(cell.getStringCellValue())) {
                // 这里传入的tableName是"Invalid_Login"
                // formatter.formatCellValue(cell)：取到单元格的值并转化为String
                // 找到一个值为"Invalid_Login"单元格
                if (tableName.equals(formatter.formatCellValue(cell))) {
                    // 若满足,则说明找到开始单元格, 用作边界单元格
                    if ("begin".equalsIgnoreCase(pos)) {
                        cells[0] = (XSSFCell) cell;
                        pos = "end";
                    } else {
                        // 找到结束单元格,用作边界单元格
                        cells[1] = (XSSFCell) cell;
                    }
                }
            }
        }
        // 返回单元格数组,包含开始和结束两个单元格对象
        return cells;
    }
}