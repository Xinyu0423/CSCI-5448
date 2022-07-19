class product:
    def _init_(self,name1,name2):
        self.name1=name1
        self.name2=name2
    
    def getProductName(self):
        return self.name2

myProduct=product("My Product1","My Product2")

productName1=myProduct.name1
print(productName1)

productName2=myProduct.getProductName()
print(productName2)