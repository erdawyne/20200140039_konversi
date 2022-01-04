/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ti.umy.pratikum.konversi;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Hawe
 */

@Controller
public class fileController {
    @RequestMapping("/Konversi")
    public String usdtoall(HttpServletRequest data, Model nominal){
    
            String inputUSD = data.getParameter("var_usd");
            
            Double iUSD = Double.valueOf(inputUSD);
            
            Double USDtoRP = iUSD * 13.000;
            Double USDtoRing = iUSD * 4.20;
            Double USDtoEur = iUSD * 0.88;
            
            nominal.addAttribute("rp", USDtoRP);
            nominal.addAttribute("ring",USDtoRing);
            nominal.addAttribute("Eur", USDtoEur);
            
            return "Viewer";
            
    }
    
 }
