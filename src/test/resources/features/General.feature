Feature: Genel fiyat incelemesi

  Scenario: Google
    Given go to Google_website
    Then search for Google_products
    Then write the Google_result
    Then write the for aldi
    Then write the for asda
    Then write the for beelivery
    Then write the for coop
    Then write the for grocerium
    Then write the for iceland
    Then write the for ocado
    Then write the for sainsbury
    Then write the for tesco
    Then write the for waitrose

    Scenario: Google 2
      Given go to Google_website
      Given genel kod

  Scenario: Sainsbury
    Given go to Sainsbury_website
    Then search for Sainsbury_products
    Then write the Sainsbury_results

  Scenario: Aldi
    Given go to Aldi_website
    Then search for Aldi_products
    Then write the Aldi_results

  Scenario: Asda
    Given go to Asda_website
    Then search for Asda_products
    Then write the Asda_results

  Scenario: Beelivery
    Given go to Beelivery_website
    Then search for Beelivery_products
    Then write the Beelivery_results

  Scenario: Coop
    Given go to Coop_website
    Then search for Coop_products
    Then write the Coop_results

  Scenario: Grocerium
    Given go to Grocerium_website
    Then search for Grocerium_products
    Then write the Grocerium_results

  Scenario: Iceland
    Given go to Iceland_website
    Then search for Iceland_products
    Then write the Iceland_results

  Scenario: Ocado
    Given go to Ocado_website
    Then search for Ocado_products
    Then write the Ocado_results

  Scenario: Tesco
    Given go to Tesco_website
    Then search for Tesco_products
    Then write the Tesco_results

  Scenario: Waitrose
    Given go to Waitrose_website
    Then search for Waitrose_products
    Then write the Waitrose_results

    Scenario: Grocerium butun urunler
      Given go to Grocerium_website
      Then bakery
      Then snacks
