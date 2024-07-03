def is_odd(n):
    if n & 1 == 1:
        return "odd"
    else:
        return "even"
print(is_odd(56))