package com.app.resource.api;

import com.app.entity.App;
import com.app.service.AppService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@ApiRestController
@AllArgsConstructor
public class AppResource {

    private final AppService appService;

    @GetMapping(value = "properties")
    public AppProperties properties() {
        return appService.getAppProperties();
    }

    @GetMapping(value = "app")
    public List<App> app() {
        return appService.getApp();
    }

    @PostMapping(value = "app/new")
    public ResponseEntity appNew(
            @RequestBody App app
    ) {
        return appService.newApp(app);
    }

}
