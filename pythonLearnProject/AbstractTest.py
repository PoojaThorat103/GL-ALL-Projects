#  To achieve abstraction need to import module ABC (Abstract base class) and also need to import abstractmethod


from abc import ABC, abstractmethod

class Bank:
    @abstractmethod  # use this decorator
    def info(self):
        pass

class SBI(Bank):
    def info(self):
        print("This is SBI")



cs = SBI()
cs.info()




