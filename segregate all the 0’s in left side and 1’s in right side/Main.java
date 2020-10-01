n=int(input())

xx=list(map(int , input().split(' ')))
d=xx.count(0)
a=xx.count(1)
print('0'*d,end='')
print('1'*a)