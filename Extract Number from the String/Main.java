import re
x=int(input())
for _ in range(x):
  
  st=input()
  y=re.findall('[0-9]+', st)
  nu=[]
  for k in y:
    if '9' not in k:
      nu.append(int(k))
  print(max(nu))
      