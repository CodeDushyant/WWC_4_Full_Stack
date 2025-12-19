package WWC_Project.WWC_Ansh_sir.Controller;

import WWC_Project.WWC_Ansh_sir.model.Event;
import WWC_Project.WWC_Ansh_sir.Service.EventService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.*;
@RestController
@RequestMapping("/events")
public class EventController {
    private final EventService eventService;
    public EventController(EventService eventService){
        this.eventService=eventService;
    }

    @GetMapping
    public ResponseEntity<List<Event>> getAllEvents(){
        return ResponseEntity.ok(eventService.getAllEvents());
    }
}
