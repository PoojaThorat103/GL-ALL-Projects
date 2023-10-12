import time

import self as self
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
from selenium.webdriver.common.keys import Keys
from selenium import webdriver


class testAll:



 def test_dropDown(self):
  driver = webdriver.Chrome()
  driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver")
  time.sleep(5)
  animal = driver.find_element("xpath", "//select[@id='animals']")
  select = Select(animal)
  select.select_by_visible_text("Avatar")
  select.select_by_value("big baby cat")
  select.select_by_index(1)

# count number of options
  print(len(select.options))

# print all options
  option_list = select.options
  for n in option_list:
    print(n.text)

 #test_dropDown(self)

 def test_links(self):
  driver = webdriver.Chrome()
  driver.get("https://demoqa.com/text-box")
  link = driver.find_elements(By.TAG_NAME, "a")
  print(len(link))
  for n in link:
    print(n.get_attribute("href"))

 # test_links(self)

 def test_WindowHandle(self):
  driver = webdriver.Chrome()
  driver.get("https://demoqa.com/browser-windows")
  driver.find_element(By.XPATH, "//button[@id='tabButton']").click()
  currentWin = driver.current_window_handle # Parent window
  print(currentWin)

  multipleWin = driver.window_handles  # return all opened browser windows values
  print(multipleWin)

  for n in multipleWin:
   driver.switch_to.window(n)
   print(driver.title)

   if driver.title=="DEMOQA":
    print("------------------------------------------------")
    driver.close()




 test_WindowHandle(self)







