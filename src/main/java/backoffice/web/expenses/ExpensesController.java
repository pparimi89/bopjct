package backoffice.web.expenses;

import com.aidiva.backoffice.domain.ExpenseRequest;
import com.aidiva.backoffice.entity.Expense;
import com.aidiva.backoffice.interfaces.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class ExpensesController {


    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/expense")
    public ResponseEntity<List<Expense>> getExpenses(@RequestBody final ExpenseRequest request){
        final List<Expense> expenses = expenseService.getExpenses(request);
        return new ResponseEntity<>(expenses, HttpStatus.OK);
    }

    @PostMapping("/expense")
    public ResponseEntity<Object> addExpenses(@RequestBody List<ExpenseRequest> request){
        expenseService.addExpenses(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PatchMapping("/expense/{id}")
    public ResponseEntity<Object> cancelExpenses(@PathParam("id") Long id){
        expenseService.deleteExpense(id); // TODO Need to make soft delete here
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
