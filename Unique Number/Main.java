m=int(input())
n=int(input())
cou=0

for k in range (m,n+1):
  kk=str(k)
  val=[]
  danger=0
  for d in kk:
    if d not in val:
      val.append(d)
    else:
      #print(k)
      danger=1
      break
  if danger==0:
    cou+=1
    
if cou==0:
  print("No Unique Number")
else:
	print(cou)
  