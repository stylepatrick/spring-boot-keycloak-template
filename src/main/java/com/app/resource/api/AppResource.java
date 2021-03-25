package com.app.resource.api;

import com.app.AppConfig;
import com.app.entity.App;
import com.app.repositroy.AppRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@ApiRestController
@AllArgsConstructor
public class AppResource {

    private final AppConfig appConfig;
    private final AppRepository appRepository;

    @GetMapping(value = "properties")
    public AppProperties properties() {
        return new AppProperties(
                appConfig.getVersion(),
                appConfig.getEnvironment()
        );
    }

    @GetMapping(value = "app")
    public List<App> app() {
        return appRepository.findAll();
    }

    @PostMapping(value = "app/new")
    public ResponseEntity appNew(
            @RequestBody App app
    ) {
        return ResponseEntity.ok(appRepository.save(app));
    }

}
