package backoffice.web;


import com.aidiva.backoffice.entity.Expense;
import com.aidiva.backoffice.respositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InventoryController {

    @Autowired
    ExpenseRepository expenseRepository;

    @GetMapping("/inventories")
    public ResponseEntity<List<Expense>> getInventoryItems() {
        return new ResponseEntity<>(expenseRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/inventories")
    public ResponseEntity<List<Expense>> addInventoryItem() {
        return new ResponseEntity<>(expenseRepository.findAll(), HttpStatus.OK);
    }

}
