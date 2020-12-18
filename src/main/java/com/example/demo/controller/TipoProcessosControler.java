package com.example.demo.controller;

import com.example.demo.model.TipoProcessos;
import com.example.demo.service.TipoProcessosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Component
//@EnableJpaRepositories
@Controller
//@RequestMapping("/funcionarios")
public class TipoProcessosControler {

  //  private TipoProcessos tipoProcessos;

  //  public TipoProcessosControler (TipoProcessos tipoProcessos){
 //       this.tipoProcessos = tipoProcessos;
  //  }
  @Autowired
    TipoProcessosService tipoProcessosService;

    @GetMapping("/tipoProcessos")
    public ResponseEntity listar() {
        return new ResponseEntity(tipoProcessosService.buscatipoProcessos(), HttpStatus.OK);
    }
    @PostMapping(value = "/tipoProcessos", consumes = "application/json")
    public ResponseEntity salvar(@Valid @RequestBody TipoProcessos tipoProcessos) {
        return new ResponseEntity(tipoProcessosService.salvatipoProcessos(tipoProcessos), HttpStatus.CREATED);
    }
    @PutMapping(value = "/tipoProcessos", consumes = "application/json")
    public ResponseEntity update(@Valid @RequestBody TipoProcessos tipoProcessos) {
        return new ResponseEntity(tipoProcessosService.salvatipoProcessos(tipoProcessos), HttpStatus.OK);
    }
    @DeleteMapping(value = "/tipoProcessos/{id}")
    public ResponseEntity deletar(@PathVariable Integer id) {
        tipoProcessosService.deletatipoProcessos(id);
        return new ResponseEntity( HttpStatus.NO_CONTENT);

    }
 //   @RequestMapping(method = RequestMethod.GET)
  //  public ModelAndView listar() {
  ///      ModelAndView modelAndView = new ModelAndView("tipoPocessos-lista.jsp");
       // modelAndView.addObject("tipoProcessos", tipoProcessos.findAll());

 //       return modelAndView;
 //   }


   // @Autowired
  //  private TipoProcessos tipoProcessos;

 //   @RequestMapping(method = RequestMethod.POST, path = "/salvar")
 //   public RedirectView salvar(
 //           TipoProcessos tipoProcessos,
  //          RedirectAttributes redirectAttributes) {
 //       TipoProcessosControler tipoProcessosService = null;
 //       tipoProcessosService.salvar(tipoProcessos);

  //      redirectAttributes.addFlashAttribute(
 //               "mensagem", "Cadastro feito com sucesso!");
//
 //       return new RedirectView("/tipoProcessos", true);
 //   }

  //  private void salvar(TipoProcessos tipoProcessos) {
//    }
}
