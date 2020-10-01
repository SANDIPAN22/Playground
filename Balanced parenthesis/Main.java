a=list(input())
ans=[]

for k in a:
  if k=='{' or k=='(' or k=='[':
    ans.append(k)
  else:
    if (len(ans)>0):
      if k==')' and ans[len(ans)-1]=='(':
        ans.pop()
      elif k=='}' and ans[len(ans)-1]=='{':
        ans.pop() 
      elif k==']' and ans[len(ans)-1]=='[':
        ans.pop()
      else:
        print('Not Balanced')
        exit()
    else:
      print('Not Balanced')
      exit()
if (len(ans)==0):
  print('Balanced')
else:
  print("Not Balanced")
	

      
       
    