package backoffice.interfaces;

import backoffice.domain.ExpenseRequest;
import backoffice.entity.Expense;

import java.util.List;

public interface ExpenseService {

    List<Expense> getExpenses(final ExpenseRequest request);

    void addExpenses(final List<ExpenseRequest> expenseRequests);

    void deleteExpense(final Long id);
}
