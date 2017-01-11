package com.allstate.controllers;

import com.allstate.models.Point;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PointController {
    @RequestMapping(value = "/points/statistics", method = RequestMethod.POST)
    public Map<String, Double> statistics(@RequestBody List<Point> points){
        double distance = Point.distance(points.get(0), points.get(1));
        double slope = Point.slope(points.get(0), points.get(1));
        double intercept = Point.intercept(points.get(0), points.get(1));
        Map<String, Double> map = new HashMap<>();
        map.put("distance", distance);
        map.put("slope", slope);
        map.put("intercept", intercept);
        return map;
    }
}
