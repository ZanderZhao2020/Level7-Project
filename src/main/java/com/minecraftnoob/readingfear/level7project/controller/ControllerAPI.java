package com.minecraftnoob.readingfear.level7project.controller;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ControllerAPI {
    @GetMapping("/NameUUID") @ApiOperation(value="Maps a player name to their UUID", response=String.class) @ApiResponses(value= {
            @ApiResponse(code=200, message="The name was valid and the UUID was found"),
            @ApiResponse(code=404, message="The name was invalid"),
            @ApiResponse(code=403, message="Miscellaneous error")
    })
    public String NameUUID(@RequestParam(value="Name") String Name) {
        return Name;
    }
}