import time

from selenium import webdriver

# Navigation


def test_google():
 driver = webdriver.Chrome()
 driver.implicitly_wait(10)
 driver.get("https://demoqa.com/elements")
 print(driver.title)
 print(driver.current_url)

 time.sleep(5)
 driver.find_element("xpath","//*[contains(text(),'Text Box') and @class = 'text']").click()
 time.sleep(5)

 driver.find_element("xpath","//input[@id='userName']").send_keys('pooja')

 time.sleep(5)
 driver.back()
 print(driver.title)

 time.sleep(5)
 driver.forward()
 print(driver.title)
