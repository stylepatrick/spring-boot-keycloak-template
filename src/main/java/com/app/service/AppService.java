package com.app.service;

import com.app.AppConfig;
import com.app.entity.App;
import com.app.repositroy.AppRepository;
import com.app.resource.api.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {

    @Autowired
    AppConfig appConfig;

    @Autowired
    AppRepository appRepository;

    public AppProperties getAppProperties() {
        return new AppProperties(
                appConfig.getVersion(),
                appConfig.getEnvironment()
        );
    }

    public List<App> getApp() {
        return appRepository.findAll();
    }

    public ResponseEntity newApp(App app) {
        return ResponseEntity.ok(appRepository.save(app));
    }

}
