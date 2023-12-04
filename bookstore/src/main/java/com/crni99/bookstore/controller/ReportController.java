//package com.crni99.bookstore.controller;
//   extra code
//import com.isdbbros.realestate.service.report.ReportService;
//import lombok.RequiredArgsConstructor;
//import net.sf.jasperreports.engine.JRException;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.util.MimeType;
//import org.springframework.util.MimeTypeUtils;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.io.IOException;
//
//import static org.springframework.http.HttpHeaders.CONTENT_TYPE;
//import static org.springframework.http.MediaType.APPLICATION_PDF_VALUE;
//
//@Controller
//@RequiredArgsConstructor
//@RequestMapping("report/")
//public class ReportController {
//
//    private final ReportService reportService;
//
//    @GetMapping("test/{format}/{id}")
//    public ResponseEntity<byte[]> generateReport(@PathVariable String format, @PathVariable Long id) throws JRException, IOException {
//        byte[] report = reportService.exportReport(format, id);
//        return getPdfResponse(report, true);
//    }
//
//    private <T> ResponseEntity<T> getPdfResponse(T data, boolean shouldDownload) {
//        HttpHeaders responseHeaders = new HttpHeaders();
//        responseHeaders.set(CONTENT_TYPE, APPLICATION_PDF_VALUE);
//        if(shouldDownload) {
//            responseHeaders.set("Content-Disposition", "attachment; filename=user_list.pdf");
//        }
//
//        return ResponseEntity.ok()
//                .headers(responseHeaders)
//                .body(data);
//    }
//
//}
