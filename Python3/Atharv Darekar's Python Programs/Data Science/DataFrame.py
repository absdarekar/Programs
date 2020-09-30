from pandas import *
df_csv=read_csv("Pokemon.csv")  # reads the .csv file
df_txt=read_csv("Pokemon.txt", delimiter=',')   # reads the .txt
print(df_csv)   # complete database
print(df_txt)   # complete database
for index in df_csv.iterrows(): # complete database row wise
    print("\n"+str(index))
print(df_csv.head(3))   # specified rows indexed from top
print(df_csv.tail(3))   # specified rows indexed from bottom
print(df_csv.columns)   # columns heads
print(df_csv[['Name','HP']])    # specified columns
print(df_csv.iloc[1])   # specified row according to indexed
print(df_csv.iloc[1:4]) # specified rows according to indexed
print(df_csv.iloc[2,5]) # specified cell
print(df_csv.loc[df_csv['Type 1']=="Fire"]) # conditional rows
print(df_csv.sort_values("Name", ascending=False))  # sorts data
print(df_csv.sort_values("HP")) # sorts data
df_csv['Total']=df_csv['HP']+df_csv['Attack']+df_csv['Defense']+df_csv['Sp. Atk']+df_csv['Sp. Def']+df_csv['Speed']
+df_csv['Generation']   # adds data under given head in the data frame
df_csv['Total']=df_csv.iloc[:,4:10].sum(axis=1)  # adds data under given rows and columns in the data frame axis 0, 1 represents column, row respectively

heads=list(df_csv.columns)
df_csv=df_csv[heads[0:4]+[heads[-1]]+heads[4:12]]   # rearragnes data frame columns

df_csv.to_csv("Updated Pokemon.csv", index=False)    # save and create new files
df_csv=df_csv.drop(columns=['Total'])  # removes data under given head in the data frame
