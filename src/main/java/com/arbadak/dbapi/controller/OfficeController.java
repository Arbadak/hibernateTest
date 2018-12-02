package com.arbadak.dbapi.controller;


    /// @Api(value = "OfficeController", description = "Управление информацией об офисах") это кажется к свагеру относится
    @RestController
    @RequestMapping(value = "/office", produces = APPLICATION_JSON_VALUE)

    public class OfficeController {

        private final OfficeProcessor officeProcessorInstance;

        public OfficeController(OfficeProcessor officeProcessorInstance) {this.officeProcessorInstance = officeProcessorInstance;}

        @PostMapping("/person")











}
