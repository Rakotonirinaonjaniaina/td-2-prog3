package controleur;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class controler<model> {

        @GetMapping("/model")
        public ResponseEntity<List<model>> getAllTutorials(@RequestParam(required = false) String team) {
            try {
                List<model> controler = new ArrayList<model>();
                if (((ArrayList<?>) controler).isEmpty()) {
                    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
                }

                return new ResponseEntity<>(controler, HttpStatus.OK);
            } catch (Exception e) {
                return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        @GetMapping("/controler/{id}")
        public ResponseEntity<controler> getTutorialById(@PathVariable("id") long id) {
            Optional<controler> tutorialData = controler.findById(id);

            if (tutorialData.isPresent()) {
                return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }

        @PostMapping("/controler")
        public ResponseEntity<controler> createTutorial(@RequestBody controler model) {
            try {
                controler _model = controlerRepository
                        .save(new controler(model.getTeam(), model.getplayer(), false));
                return new ResponseEntity<>(_controler, HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        @PutMapping("/controler/{id}")
        public ResponseEntity<controler> updateTutorial(@PathVariable("id") long id, @RequestBody controler model) {
            Optional<controler> tutorialData = controlerRepository.findById(id);

            if (tutorialData.isPresent()) {
                Tutorial _tutorial = tutorialData.get();
                _tutorial.setTitle(tutorial.getTitle());
                _tutorial.setDescription(tutorial.getDescription());
                _tutorial.setPublished(tutorial.isPublished());
                return new ResponseEntity<>(tutorialRepository.save(_tutorial), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }

        @DeleteMapping("/controler/{id}")
        public ResponseEntity<HttpStatus> deletecontroler(@PathVariable("id") long id) {
            try {
                controlerRepository.deleteById(id);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        @DeleteMapping("/tutorials")
        public ResponseEntity<HttpStatus> deleteAllTutorials() {
            try {
                tutorialRepository.deleteAll();
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }

        @GetMapping("/tutorials/published")
        public ResponseEntity<List<Tutorial>> findByPublished() {
            try {
                List<Tutorial> tutorials = tutorialRepository.findByPublished(true);

                if (tutorials.isEmpty()) {
                    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
                }
                return new ResponseEntity<>(tutorials, HttpStatus.OK);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

    }
