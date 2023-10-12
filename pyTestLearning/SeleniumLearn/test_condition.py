import time

from selenium import webdriver
from selenium.common import ElementClickInterceptedException, ElementNotSelectableException
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait





# Conditional commands like - is_display()
# Implicit wait
# Explicit wait

def test_google():
 driver = webdriver.Chrome()

 # Implicit wait
 driver.implicitly_wait(10)
 driver.get("https://demoqa.com/elements")
 ele = driver.find_element("xpath","//*[contains(text(),'Text Box') and @class = 'text']")

# Explicit wait
 wait=WebDriverWait(driver,10)
 wait.until(expected_conditions.element_to_be_clickable((ele)))
 ele.click()

 time.sleep(4)
 print(ele.is_displayed())

 print(ele.is_enabled())

# Fluent wait #Note : here we can pass multiple exception
 wait=WebDriverWait(driver,10,2,ignored_exceptions=[ElementClickInterceptedException, ElementNotSelectableException])
 wait.until(expected_conditions.element_to_be_clickable((ele)))
