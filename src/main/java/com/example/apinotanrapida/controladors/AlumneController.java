package com.example.apinotanrapida.controladors;



import com.example.apinotanrapida.clases.Alumne;
import com.example.apinotanrapida.repositories.AlumneDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("api")
public class AlumneController {

    @Autowired
    AlumneDAO alumneDAO;
    @GetMapping("alumnes")
    public String alumnes(Model model){
        model.addAttribute("alumnes", alumneDAO.findAll());
        return "llistaAlumnes.html";
    }
    
    @GetMapping("/alumnes/nou")
    public String mostrarFormulariProjecte(Model model) {

        Alumne alumne = new Alumne();
        model.addAttribute("alumne", alumne);
        return "nouAlumn.html";
    }

    @PostMapping("alumnes/alta")
    public String altaProjecte(Alumne alumne){
        alumneDAO.save(alumne);
        return "redirect:/api/alumnes";
    }
}
