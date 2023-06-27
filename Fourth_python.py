def restore_equation(equation):
    left, right = equation.split("=")
    q_index = left.index("?")
    w_index = left.index("?", q_index + 1)
    left_template = left.replace("?", "{}")
    
    for q in range(10):
        for w in range(10):
            eq = left_template.format(q, w)
            if eval(eq) == int(right):
                solution = equation.replace("?", str(q),1).replace("?", str(w))
                return solution
    
    return "Решение не найдено"

equation = '3? + ?0 = 45'
solution = restore_equation(equation)
print(solution)