package com.example.apinotanrapida.controladors;

import com.example.apinotanrapida.clases.Empresa;
import com.example.apinotanrapida.repositories.EmpresaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("apii")
public class EmpresaController {

    @Autowired
    EmpresaDAO empresaDAO;

    @GetMapping("empreses")
    public String empreses(Model model){
        System.out.println("funciona");
        model.addAttribute("empreses", empresaDAO.findAll());

        return "llistaEmpreses";
    }

    @GetMapping("/empreses/nou")
    public String mostrarFormulariEmpresa(Model model) {
        Empresa empresa = new Empresa();
        model.addAttribute("empresa", empresa);
        return "nouEmpresa";
    }

    @PostMapping("empresa/alta")
    public String altaEmpresa(Empresa empresa){
        empresaDAO.save(empresa);
        return "redirect:/api/empreses";
    }
}
