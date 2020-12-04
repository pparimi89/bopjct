package backoffice.service;

import backoffice.domain.ExpenseRequest;
import backoffice.entity.Expense;
import backoffice.interfaces.ExpenseService;
import backoffice.respositories.ExpenseRepository;
import backoffice.util.BackOfficeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Expense> getExpenses(final ExpenseRequest request) {
        final CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        final CriteriaQuery<Expense> criteriaQuery = criteriaBuilder.createQuery(Expense.class);

        final Root<Expense> expenseRoot = criteriaQuery.from(Expense.class);
        final List<Predicate> predicates = new ArrayList<>();

        if (Objects.nonNull(request.getPaymentMode())) {
            predicates.add(criteriaBuilder.equal(expenseRoot.get("paymentMode"), request.getPaymentMode()));
        }
        if (Objects.nonNull(request.getFromDate()) && Objects.nonNull(request.getToDate())) {
            predicates.add(criteriaBuilder.between(expenseRoot.get("createdOn"), request.getFromDate(), request.getToDate()));
        }
        criteriaQuery.where(predicates.toArray(new Predicate[0]));

        return entityManager.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public void addExpenses(final List<ExpenseRequest> expenseRequests) {
        final List<Expense> expenses = expenseRequests.stream().map(expenseRequest -> {
            final Expense expense = new Expense();
            expense.setPaymentAmount(expenseRequest.getCost());
            expense.setTentId(expenseRequest.getTentId());
            expense.setCreatedBy(111L);
            expense.setCreatedOn(BackOfficeUtil.getCurrentDate());
            expense.setModifiedOn(expenseRequest.getMadeOn());
            expense.setNotes(expenseRequest.getNotes());
            expense.setBankName(expenseRequest.getBankName());
            expense.setPaymentMode(expenseRequest.getPaymentMode());
            expense.setPaymentAmount(expenseRequest.getPaymentAmount());
            expense.setTentExpenseType(expenseRequest.getType());
            expense.setTentVendorName(expenseRequest.getVendorCategoryName());
            expense.setModifiedBy(111L);
            return expense;
        }).collect(Collectors.toList());
        expenseRepository.saveAll(expenses);
    }

    @Override
    public void deleteExpense(final Long id) {
        expenseRepository.deleteById(id);
    }
}
