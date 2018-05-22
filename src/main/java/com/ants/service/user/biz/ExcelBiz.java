package com.ants.service.user.biz;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ants.common.utils.ExcelUtil;
import com.ants.facade.user.entity.TJobInfo;
import com.ants.service.user.dao.impl.TJobInfoDaoImpl;

/**
 * @ClassName: ExcelBiz
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 马高伟
 * @date 2018年4月8日
 * 
 */
@Service("excelBiz")
public class ExcelBiz {

/*	@Autowired
	private TJobInfoDaoImpl dao;
	@Autowired
	HttpServletResponse response;
	
	public void exportExcel(String hql, String[] titles) {
		List<TJobInfo> list = dao.selectByMap(new HashMap());
		// 创建一个workbook 对应一个excel应用文件
		XSSFWorkbook workBook = new XSSFWorkbook();
		// 在workbook中添加一个sheet,对应Excel文件中的sheet
		XSSFSheet sheet = workBook.createSheet("导出excel例子");
		ExcelUtil exportUtil = new ExcelUtil(workBook, sheet);
		XSSFCellStyle headStyle = exportUtil.getHeadStyle();
		XSSFCellStyle bodyStyle = exportUtil.getBodyStyle();
		// 构建表头
		XSSFRow headRow = sheet.createRow(0);
		XSSFCell cell = null;
		for (int i = 0; i < titles.length; i++) {
			cell = headRow.createCell(i);
			cell.setCellStyle(headStyle);
			cell.setCellValue(titles[i]);
		}
		// 构建表体数据
		if (list != null && list.size() > 0) {
			for (int j = 0; j < list.size(); j++) {
				XSSFRow bodyRow = sheet.createRow(j + 1);
				TJobInfo jobInfo = list.get(j);
				

				cell = bodyRow.createCell(0);
				cell.setCellStyle(bodyStyle);
				cell.setCellValue(jobInfo.getId());

				cell = bodyRow.createCell(1);
				cell.setCellStyle(bodyStyle);
				cell.setCellValue(jobInfo.getJobName());

				cell = bodyRow.createCell(2);
				cell.setCellStyle(bodyStyle);
				cell.setCellValue(jobInfo.getJobName());
			}
		}
		try {
			
			response.setContentType("application/binary;charset=ISO8859_1"); 
			ServletOutputStream outputStream = response.getOutputStream();  
            String fileName = new String(("导出excel例子").getBytes(), "ISO8859_1");  
            response.setHeader("Content-disposition", "attachment; filename=" + fileName + ".xlsx");// 组装附件名称和格式  
			workBook.write(outputStream);
			outputStream.flush();
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}*/

}