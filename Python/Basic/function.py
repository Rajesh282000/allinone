def f1():
    s = 'I love GeeksforGeeks'
    
    def f2():
        print(s)
        
    f2()

f1()


#Lambda function example
s1 = 'GeeksforGeeks'

s2 = lambda func: func.upper()
print(s2(s1))

#filter function example
# Example: Filter even numbers from a list
n = [1, 2, 3, 4, 5, 6]
even = filter(lambda x: x % 2 == 0, n)
print(list(even))

#iterating through a list using map
a = [1, 2, 3, 4, 5]
b =[]
for i in a:
    b.append(i * 2)
    print(b)